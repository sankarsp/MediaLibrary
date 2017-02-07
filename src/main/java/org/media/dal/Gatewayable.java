package org.media.dal;

import java.util.List;

/**
 * Created by shantonu on 2/7/17.
 */
public interface Gatewayable {
    <T> List<T> viewAll();
}
