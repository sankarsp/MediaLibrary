package org.media.GatewayTests;

import org.junit.Before;
import org.media.TestBase;
import org.media.dal.gateways.GenreGateway;

/**
 * Created by shantonu on 2/25/17.
 */
public class GenreGatewayTest extends TestBase{
    private GenreGateway aGenreGateway;
    @Before
    public void init(){
        aGenreGateway = new GenreGateway();
    }

}
