package org.media.dal;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shantonu on 1/27/17.
 */
public class Gateway {

    private static Connection aConnection = null;
    Gateway(){}
    public static <T> List<T> createObjects(ResultSet resultSet, Class<T> tClass) throws
            SQLException, IllegalAccessException, InstantiationException, IntrospectionException, InvocationTargetException {
        List<T> listImtes = new ArrayList<T>();
        while (resultSet.next()) {
            T intance = tClass.newInstance();
            for (Field field : tClass.getDeclaredFields()) {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), tClass);
                //System.out.println("PD " + pd.getName());
                Method method = pd.getWriteMethod();
              /*  System.out.println("Method : " + method.getName());
                System.out.println("Method : Parameter count " + method.getParameterCount());*/
                Class[] types = method.getParameterTypes();
                //System.out.println("Method : Parameter type "+types[0]);
                Object value = resultSet.getObject(field.getName());
                method.invoke(intance, (types[0]).cast(value));
            }
            listImtes.add(intance);
        }
        return listImtes;
    }
    public static Connection getConn(){
        if(aConnection==null){
            try {
                aConnection = getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return aConnection;
    }

    public static String url= "jdbc:mysql://"+
            System.getProperty("mysql.host")+":"+
            System.getProperty("mysql.port")+"/"+
            System.getProperty("mysql.db");
    private static final String user = System.getProperty("mysql.user.name");
    private static final String pass = System.getProperty("mysql.user.pass");
    private static final String className = "com.mysql.jdbc.Driver";

    private static synchronized Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection(url, user, pass);
    }
    private static synchronized Connection getLegacyConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName(className).newInstance();
        return DriverManager.getConnection(url,user,pass);
    }
    protected ResultSet runQuerry(String query) throws SQLException {
        Statement pt = getConn().createStatement();
        return pt.executeQuery(query);
    }

}
