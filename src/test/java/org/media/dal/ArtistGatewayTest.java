package org.media.dal;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.media.TestBase;
import org.media.model.Artist;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGatewayTest extends TestBase {

    private ArtistGateway anArtistGateway;
    private Connection conneciton;
    @Before
    public void inittest(){
        conneciton = Gateway.getConn();
        anArtistGateway = new ArtistGateway(conneciton);
    }

    @Test
    public void testGetAnArtistFromDB(){
        Artist artist = anArtistGateway.getAnArtist("Name");
        Assert.assertEquals("Name", artist.getName());
        artist = anArtistGateway.getAnArtist(1l);
        Assert.assertEquals(Long.valueOf(1), artist.getId());

        Long id = anArtistGateway.insert(new Artist(99, "shantonu"));
        artist = anArtistGateway.getAnArtist(id);
        Assert.assertEquals(Long.valueOf(1), artist.getId());

    }

    @Test
    public void testGetAllArtistFromDB(){
        try {
            List<Artist> allArtist = anArtistGateway.getAllArtist();
            Assert.assertTrue(allArtist.size()>0);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testDeleteAnArtistFromDB(){

    }
    @Test
    public void testUpdateAnArtistFromDB(){

    }
    @Test
    public void testcreateAnArtistFromDB(){

    }
}
