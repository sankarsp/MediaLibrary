package org.media.dal;

import org.junit.Before;
import org.junit.Test;
import org.media.TestBase;

import java.sql.Connection;

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

    }

    @Test
    public void testGetAllArtistFromDB(){

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
