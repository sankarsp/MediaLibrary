package org.media.core;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 2/7/17.
 */
public interface Gatewayable<T> {
    List<T> viewAll() throws SQLException, InvocationTargetException, IntrospectionException, InstantiationException, IllegalAccessException;

    T view(Long id) throws SQLException;

    Long Insert(T t);

    void remove(Long id);

    void remove(T t);

    Long update(T t);

}
