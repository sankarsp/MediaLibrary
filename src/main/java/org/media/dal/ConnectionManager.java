package org.media.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ssarker on 2/6/2017.
 */
public class ConnectionManager {

    private ConnectionManager(){}
    private static Connection aConnection = null;
    public static String url = "jdbc:mysql://" +
            System.getProperty("mysql.host") + ":" +
            System.getProperty("mysql.port") + "/" +
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
        return DriverManager.getConnection(url, user, pass);
    }

    public static Connection getConn() {
        if (aConnection == null) {
            try {
                aConnection = getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return aConnection;
    }

    public static void close() throws SQLException {
        aConnection.close();
        aConnection=null;
    }
}
