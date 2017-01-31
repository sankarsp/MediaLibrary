package org.media.dal;

import java.sql.*;

/**
 * Created by shantonu on 1/27/17.
 */
public class Gateway {

    private static Connection aConnection = null;
    private Gateway(){}

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
    public static ResultSet runQuerry(String query) throws SQLException {
        Statement pt = getConn().createStatement();
        return pt.executeQuery(query);
    }

}
