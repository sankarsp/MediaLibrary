package org.media.dal;

import java.sql.Connection;

/**
 * Created by shantonu on 1/27/17.
 */
public class Gateway {

    private static Connection aConnection = null;
    private Gateway(){}

    public static Connection getConnection(){
        if(aConnection==null){
    //create the connection from the DB
        }
        return aConnection;
    }
}
