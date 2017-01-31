package org.media.dal;

import java.sql.Connection;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGateway extends Gateway{
    private Connection aConnection;
    public ArtistGateway(Connection conneciton) {
        super();
        this.aConnection = conneciton;
    }
}
