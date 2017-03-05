package com.rule.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/3/5.
 * 基础的接口
 */
public interface BasicMapper<T,PK> {
    //增
    int add(T entity) throws SQLException;
    //删
    int deleteById(PK id) throws SQLException;
    //改
    int updateByEntity(T entity) throws SQLException;
    //查
    List<T> getAll() throws SQLException;
    //通过pk查找
    T selectById(PK id) throws SQLException;
}
