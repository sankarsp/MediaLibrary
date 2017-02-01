package org.media.dal;

import org.media.model.Artist;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGateway extends Gateway{
    private Connection aConnection;
    public ArtistGateway(Connection conneciton) {
        super();
        this.aConnection = conneciton;
    }

    public List<Artist> getAllArtist() throws SQLException, InvocationTargetException, IntrospectionException, InstantiationException, IllegalAccessException {
        String query = "select 8 from t_Artist";
        return createObjects(runQuerry(query),Artist.class);
    }

    public Artist getAnArtist(String name) {
        return new Artist();
    }
    public Artist getAnArtist(Long id) {
        return new Artist();
    }

    public Long insert(Artist anArtist) throws SQLException {
        String q = "INSERT INTO t_Artist VALUES ("+anArtist.getId()+", \""+anArtist.getName()+"\");";

        runQuerry(q);

        return anArtist.getId();
    }
}
