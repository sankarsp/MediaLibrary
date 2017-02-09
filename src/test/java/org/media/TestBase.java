package org.media;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.media.dal.ConnectionManager;

import java.sql.Connection;

/**
 * Created by shantonu on 1/27/17.
 */
public abstract class TestBase {
    public static Connection aConnection;

    @BeforeClass
    public static void initClass(){
        aConnection = ConnectionManager.getConn();
    }
    @AfterClass
    public static void tearDownClass(){
        aConnection = ConnectionManager.getConn();
    }
}
