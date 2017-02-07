package org.media.dal;

import java.util.List;

/**
 * Created by shantonu on 2/7/17.
 */
public interface Gatewayable<T> {
    List<T> viewAll();

    T view(Long id);

    Long Insert(T t);

    void remove(Long id);

    void remove(T t);

    Long update(T t);

}
