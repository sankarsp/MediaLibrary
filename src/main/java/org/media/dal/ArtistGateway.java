package org.media.dal;

import java.sql.Connection;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGateway {
    private Connection aConnection;
    public ArtistGateway(Connection conneciton) {
        this.aConnection = conneciton;
    }
}
