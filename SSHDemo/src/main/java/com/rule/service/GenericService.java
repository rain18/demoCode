package com.rule.service;

import java.util.List;

/**
 * Created by rain on 2017/3/1.
 */
public interface GenericService<T,PK> {
    T load(PK id);
    T get(PK id);
    List<T> getAll();
    void save(T entity);
    void update(T entity);
    void saveOrUpdate(T entity);
    void delete(PK id);
}
