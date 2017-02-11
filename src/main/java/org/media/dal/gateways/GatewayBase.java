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
        aConnection = ConnectionManager.getConn();
    }
    protected ResultSet runQuerry(String query) throws SQLException {
        Statement pt = aConnection.createStatement();
        return pt.executeQuery(query);
    }

}
