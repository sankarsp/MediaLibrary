package org.media.dal.gateways;

import org.media.core.Gatewayable;
import org.media.model.Track;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class TrackGateway implements Gatewayable<Track> {
    @Override
    public List<Track> viewAll() {
        return null;
    }

    @Override
    public Track view(Long id) {
        return null;
    }

    @Override
    public Long Insert(Track track) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Track track) {

    }

    @Override
    public Long update(Track track) {
        return null;
    }
}
