package org.media.dal.gateways;

import org.media.dal.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by shantonu on 2/8/17.
 */
public abstract class GatewayBase {
    protected Connection aConnection;
    public GatewayBase(){
        try {
            aConnection = ConnectionManager.getConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected ResultSet runQuerry(String query) throws SQLException {
        Statement pt = aConnection.createStatement();

        ResultSet resultSet = pt.executeQuery(query);

        pt.close();
        return resultSet;
    }
    protected int executeUpdate(String query) throws SQLException {
        Statement pt = aConnection.createStatement();
        int resultSet = pt.executeUpdate(query);
        pt.close();
        return resultSet;
    }
}
