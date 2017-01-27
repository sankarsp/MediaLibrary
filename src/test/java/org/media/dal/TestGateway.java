package org.media.dal;

import org.junit.Assert;
import org.junit.Before;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by shantonu on 1/27/17.
 */
public class TestGateway {
    private Connection aConnection;

    @Before
    public void initTest(){
        Gateway.getConnection();
    }
    public void testConnection(){
        Assert.assertNotNull(aConnection);
        try {
            Assert.assertFalse(aConnection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
