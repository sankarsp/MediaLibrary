package org.media.dal.gateways;

import org.media.core.Gateway;
import org.media.model.Recording;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class RecordingGateway implements Gateway<Recording> {
    @Override
    public List<Recording> viewAll() {
        return null;
    }

    @Override
    public Recording view(Long id) {
        return null;
    }

    @Override
    public Long Insert(Recording recording) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Recording recording) {

    }

    @Override
    public Long update(Recording recording) {
        return null;
    }
}
