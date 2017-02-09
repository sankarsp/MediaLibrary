package org.media.core;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by shantonu on 2/7/17.
 */
public interface Gateway<T> {
    List<T> viewAll();

    T view(Long id);

    Long Insert(T t);

    void remove(Long id);

    void remove(T t);

    Long update(T t);

}
