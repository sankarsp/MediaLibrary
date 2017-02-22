package org.media.GatewayTests;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.media.TestBase;
import org.media.dal.gateways.ArtistGateway;
import org.media.model.Artist;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGatewayTest extends TestBase {

    private ArtistGateway anArtistGateway;

    @Before
    public void init(){
        anArtistGateway = new ArtistGateway();
    }

    @Test
    public void testGetAnArtistFromDB(){
        Artist artist = null;
        artist = anArtistGateway.view("Name");
        assertEquals("Name", artist.getNAME());
        artist = anArtistGateway.view(1);
        assertEquals(Integer.valueOf(1), artist.getID());
        Integer id = anArtistGateway.insert(new Artist(99, "shantonu"));
        artist = anArtistGateway.view(id);
        assertEquals(Integer.valueOf(1), artist.getID());
    }

    @Test
    public void testGetAllArtistFromDB(){
        List<Artist> allArtist = anArtistGateway.viewAll();
        assertTrue(allArtist.size()>0);
        for(Artist artist : allArtist){
            Artist found = anArtistGateway.view(artist.getID());
            assertEquals(found.getID(), artist.getID());
            assertEquals(found.getNAME(), artist.getNAME());
        }
    }

    @Test
    public void testDeleteAnArtistFromDB(){
        Integer testId = 1;
        String name = "sha";
        anArtistGateway.insert(new Artist(testId,name));
        anArtistGateway.remove(1);
        assertNull(anArtistGateway.view(1));

    }
    @Test
    public void testUpdateAnArtistFromDB(){
        Artist anArtist = new Artist(1,"sha");
        anArtistGateway.insert(anArtist);
        anArtist = new Artist(1,"sarker");
        assertEquals(new Integer(1),anArtistGateway.update(anArtist));
        assertEquals(anArtist,anArtistGateway.view(1));

    }
    @Test
    public void testInsertAnArtistFromDB(){

        Artist anArtist = new Artist(1,"sha");

        assertEquals(new Integer(1), anArtistGateway.insert(anArtist));
        assertEquals(anArtist, anArtistGateway.view(1));
        anArtistGateway.remove(1);

    }
}
