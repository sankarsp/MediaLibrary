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
public class ArtistGateway extends GatewayBase implements Gateway<Artist> {

    private static final String table="t_Artist";


    public List<Artist> viewAll(){
        String query = "select* from "+table;
        List<Artist> all = null;
        try {
            all= getAsList(runQuerry(query),Artist.class);
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
        String q = "SELECT * from "+table+" where NAME='"+name+"'";

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Artist();
    }
    public Artist view(Long id)  {
        String q = "SELECT * from "+table+" where ID="+id.toString();

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Artist();
    }

    @Override
    public Long insert(Artist anArtist) {
        String q = "INSERT INTO "+table+" VALUES ("+anArtist.getID()+", \""+anArtist.getNAME()+"\");";

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return anArtist.getID();
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Artist artist) {

    }
    @Override
    public Long update(Artist anArtist) {
        return anArtist.getID();
    }
}
