package org.media.dal;


import static org.junit.Assert.*;
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
        Artist artist = null;
        try {
            artist = anArtistGateway.view("Name");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals("Name", artist.getName());
        try {
            artist = anArtistGateway.view(1l);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(Long.valueOf(1), artist.getId());

        Long id = null;
        try {
            id = anArtistGateway.insert(new Artist(99l, "shantonu"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            artist = anArtistGateway.view(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(Long.valueOf(1), artist.getId());

    }

    @Test
    public void testGetAllArtistFromDB(){
        try {
            List<Artist> allArtist = anArtistGateway.viewAll();
            assertTrue(allArtist.size()>0);
            for(Artist artist : allArtist){
                assertEquals(anArtistGateway.view(artist.getId()), artist);
            }

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

        Long testId = 1l;
        String name = "sha";
        try {
            anArtistGateway.insert(new Artist(testId,name));
            anArtistGateway.remove(1l);
            assertNull(anArtistGateway.view(1l));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testUpdateAnArtistFromDB(){
        Artist anArtist = new Artist(1l,"sha");
        anArtistGateway.update(new)

    }
    @Test
    public void testInsertAnArtistFromDB(){

        Artist anArtist = new Artist(1l,"sha");
        try {

            assertEquals(new Long(1), anArtistGateway.insert(anArtist));
            assertEquals(anArtist, anArtistGateway.view(1l));
            anArtistGateway.remove(1l);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
