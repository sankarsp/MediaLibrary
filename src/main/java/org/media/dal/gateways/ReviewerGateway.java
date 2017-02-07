package org.media.dal.gateways;

import org.media.core.Gatewayable;
import org.media.model.Reviewer;

import java.util.List;

/**
 * Created by ssarker on 2/5/2017.
 */
public class ReviewerGateway implements Gatewayable<Reviewer>{
    @Override
    public List<Reviewer> viewAll() {
        return null;
    }

    @Override
    public Reviewer view(Long id) {
        return null;
    }

    @Override
    public Long Insert(Reviewer reviewer) {
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
