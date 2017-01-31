package org.media.dal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by shantonu on 1/27/17.
 */
public class TestGateway {
    private Connection aConnection;

    @Before
    public void initTest() {
        aConnection = Gateway.getConn();
    }

    @Test
    public void testConnectionOpen() {
        Assert.assertNotNull(aConnection);
        try {
            Assert.assertFalse(aConnection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCunnectionUrl() {
        Assert.assertNotNull(Gateway.url);
        Assert.assertEquals("jdbc:mysql://localhost:3306/medialib", Gateway.url);
    }
}
