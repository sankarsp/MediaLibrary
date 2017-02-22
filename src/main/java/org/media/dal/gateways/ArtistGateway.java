package org.media.dal.gateways;

import static org.media.utils.ResultSetHelper.*;

import org.media.core.Gateway;
import org.media.model.Artist;
import org.media.utils.IDGenerator;
import org.media.utils.ResultSetHelper;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
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
    public Artist view(Integer id)  {
        String q = "SELECT * from "+table+" where ID="+id.toString();
        ResultSet resultSet = null;
        Artist result = null;
        try {
           resultSet =  runQuerry(q);
            result = ResultSetHelper.getItem(resultSet,Artist.class);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Integer insert(Artist anArtist) {
        anArtist.setID(IDGenerator.getNextID(table));
        String q = "INSERT INTO "+table+" VALUES ("+anArtist.getID()+", \""+anArtist.getNAME()+"\")";
        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return anArtist.getID();
    }

    @Override
    public void remove(Integer id) {
      //  String q = "DELETE FROM "+table+" where
    }

    @Override
    public void remove(Artist artist) {
    }
    @Override
    public Integer update(Artist anArtist) {
        return anArtist.getID();
    }
}
