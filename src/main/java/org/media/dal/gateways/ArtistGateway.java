package org.media.dal.gateways;

import static org.media.utils.ResultSetHelper.*;

import org.media.core.Gateway;
import org.media.model.Artist;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 1/31/17.
 */
public class ArtistGateway implements Gateway<Artist> {
    private Connection aConnection;
    public ArtistGateway(Connection conneciton) {
        super();
        this.aConnection = conneciton;
    }

    public List<Artist> viewAll() throws SQLException, InvocationTargetException, IntrospectionException, InstantiationException, IllegalAccessException {
        String query = "select 8 from t_Artist";
        return createObjects(runQuerry(query),Artist.class);
    }

    public Artist view(String name) throws SQLException {
        String q = "SELECT * from t_Artist where NAME='"+name+"'";

        runQuerry(q);

        return new Artist();
    }
    public Artist view(Long id) throws SQLException {
        String q = "SELECT * from t_Artist where ID="+id.toString();

        runQuerry(q);
        return new Artist();
    }

    @Override
    public Long Insert(Artist artist) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Artist artist) {

    }

    public Long insert(Artist anArtist) throws SQLException {
        String q = "INSERT INTO t_Artist VALUES ("+anArtist.getId()+", \""+anArtist.getName()+"\");";

        runQuerry(q);

        return anArtist.getId();
    }

    public void remove(long l) {

    }

    public Long update(Artist anArtist) {
        return anArtist.getId();
    }
}
