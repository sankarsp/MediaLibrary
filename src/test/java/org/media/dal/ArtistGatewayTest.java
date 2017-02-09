package org.media.dal;


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
        anArtistGateway = new ArtistGateway(aConnection);
    }

    @Test
    public void testGetAnArtistFromDB(){
        Artist artist = null;
        artist = anArtistGateway.view("Name");
        assertEquals("Name", artist.getNAME());
        artist = anArtistGateway.view(1l);
        assertEquals(Long.valueOf(1), artist.getID());

        Long id = null;
        id = anArtistGateway.insert(new Artist(99l, "shantonu"));
        artist = anArtistGateway.view(id);
        assertEquals(Long.valueOf(1), artist.getID());

    }

    @Test
    public void testGetAllArtistFromDB(){
        List<Artist> allArtist = anArtistGateway.viewAll();
        assertTrue(allArtist.size()>0);
        for(Artist artist : allArtist){
            assertEquals(anArtistGateway.view(artist.getID()), artist);
        }

    }

    @Test
    public void testDeleteAnArtistFromDB(){

        Long testId = 1l;
        String name = "sha";
        anArtistGateway.insert(new Artist(testId,name));
        anArtistGateway.remove(1l);
        assertNull(anArtistGateway.view(1l));

    }
    @Test
    public void testUpdateAnArtistFromDB(){
        Artist anArtist = new Artist(1l,"sha");
        anArtistGateway.insert(anArtist);
        anArtist = new Artist(1l,"sarker");
        assertEquals(new Long(1l),anArtistGateway.update(anArtist));
        assertEquals(anArtist,anArtistGateway.view(1l));

    }
    @Test
    public void testInsertAnArtistFromDB(){

        Artist anArtist = new Artist(1l,"sha");

        assertEquals(new Long(1), anArtistGateway.insert(anArtist));
        assertEquals(anArtist, anArtistGateway.view(1l));
        anArtistGateway.remove(1l);

    }
}
