package org.media.dal.gateways;

import org.media.core.Gateway;
import org.media.model.Genre;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import static org.media.utils.ResultSetHelper.getAsList;
import static org.media.utils.ResultSetHelper.runQuerry;

/**
 * Created by ssarker on 2/5/2017.
 */
public class GenreGateway implements Gateway<Genre> {
    private static final String table="t_Genre";

    @Override
    public List<Genre> viewAll() {
        String query = "select* from "+table;
        List<Genre> all = null;
        try {
            all= getAsList(runQuerry(query),Genre.class);
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

    @Override
    public Genre view(Long id) {
        String q = "SELECT * from "+table+" where ID="+id.toString();

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Genre();
    }
    public Genre view(String name) {
        String q = "SELECT * from "+table+" where NAME='"+name+"'";

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Genre();
    }
    @Override
    public Long insert(Genre genre) {
        String q = "INSERT INTO "+table+" VALUES ("+genre.getID()+", \""+genre.getNAME()+"\");";

        try {
            runQuerry(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return genre.getID();
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Genre genre) {

    }

    @Override
    public Long update(Genre genre) {
        return null;
    }
}
