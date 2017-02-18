package org.media.utils;

import com.mysql.cj.jdbc.util.ResultSetUtil;
import org.media.dal.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by shantonu on 2/17/17.
 */
public class IDGenerator {



//decision 1 : lets keep IDs in seperate table in DB
    public static Integer giveMeNextId(String tableName){
        Integer result = null;
        try {
            final String q ="select id from t_ID where table='"+tableName+"'";
            Connection aConnection = ConnectionManager.getConn();

            Statement pt = aConnection.createStatement();

            ResultSet resultSet = pt.executeQuery(q);
            ResultSetHelper
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return result;
    }

}
