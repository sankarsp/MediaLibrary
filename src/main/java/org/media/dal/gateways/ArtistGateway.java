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

    public List<Artist> viewAll(){
        String query = "select* from t_Artist";
        List<Artist> all = null;
        try {
            all= createObjects(runQuerry(query),Artist.class);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return all;
    }

    public Artist view(String name) {
        String q = "SELECT * from t_Artist where NAME='"+name+"'";

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Artist();
    }
    public Artist view(Long id)  {
        String q = "SELECT * from t_Artist where ID="+id.toString();

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        String q = "INSERT INTO t_Artist VALUES ("+anArtist.getID()+", \""+anArtist.getNAME()+"\");";

        runQuerry(q);

        return anArtist.getID();
    }

    public void remove(long l) {

    }

    public Long update(Artist anArtist) {
        return anArtist.getID();
    }
}
