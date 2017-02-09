package org.media.utils;

import org.media.dal.ConnectionManager;

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
public class ResultSetHelper {
    public ResultSetHelper() {
    }

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

    public static ResultSet runQuerry(String query) throws SQLException {
        Statement pt = ConnectionManager.getConn().createStatement();
        return pt.executeQuery(query);
    }

    protected static Long getNextId(String tableName) {
        return 0l;

    }

}
