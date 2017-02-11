package org.media.dal;

import org.junit.Assert;
import org.junit.Test;
import org.media.TestBase;

import java.sql.SQLException;

/**
 * Created by shantonu on 1/27/17.
 */
public class ConnectionManagerTest extends TestBase{
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
        Assert.assertNotNull(ConnectionManager.url);
        Assert.assertEquals("jdbc:mysql://localhost:3306/medialib", ConnectionManager.url);
    }
}
