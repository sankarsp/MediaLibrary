package org.media;

import org.junit.BeforeClass;
import org.media.dal.gateways.ConnectionManager;

import java.sql.Connection;

/**
 * Created by shantonu on 1/27/17.
 */
public abstract class TestBase {
    public static Connection aConnection;

    @BeforeClass
    public static void initTestClass(){
        aConnection = ConnectionManager.getConn();
    }
}
