package org.media.dal.gateways;

import org.media.core.Gateway;
import org.media.model.Label;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class LabelGateway implements Gateway<Label> {
    @Override
    public List<Label> viewAll() {
        return null;
    }

    @Override
    public Label view(Long id) {
        return null;
    }

    @Override
    public Long Insert(Label label) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Label label) {

    }

    @Override
    public Long update(Label label) {
        return null;
    }
}
