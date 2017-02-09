package org.media.dal.gateways;

import org.media.core.Gateway;
import org.media.model.Reviewer;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class ReviewerGateway implements Gateway<Reviewer> {
    @Override
    public List<Reviewer> viewAll() {
        return null;
    }

    @Override
    public Reviewer view(Long id) {
        return null;
    }

    @Override
    public Long insert(Reviewer reviewer) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Reviewer reviewer) {

    }

    @Override
    public Long update(Reviewer reviewer) {
        return null;
    }
}
