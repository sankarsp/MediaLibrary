package org.media.dal.gateways;

import org.media.core.Gateway;
import org.media.model.Genre;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class GenreGateway implements Gateway<Genre> {


    @Override
    public List<Genre> viewAll() {
        return null;
    }

    @Override
    public Genre view(Long id) {
        return null;
    }

    @Override
    public Long Insert(Genre genre) {
        return null;
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
