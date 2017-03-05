package com.rule.dao;

import java.util.List;

/**
 * Created by rain on 2017/3/5.
 */
public interface GenericDao<T,PK> {
    T load(PK id);
    T get(PK id);
    List<T> getAll();
    void save(T entity);
    void update(T entity);
    void saveOrUpdate(T entity);
    void delete(PK id);
}
