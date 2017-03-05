package com.rule.service;

import com.rule.mapper.BasicMapper;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/3/5.
 * service 中一些公共的方法
 */
public abstract class BasicService<T,PK> {

    private static Logger logger = Logger.getLogger(BasicService.class);

    protected abstract BasicMapper<T,PK> getMapper();

    //插入成功返回的数据库改变的行数
    public int add(T entity) {
        try {
            int rs = getMapper().add(entity);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return -1;
        }
    }

    public int deleteById(PK id) {
        try {
            int rs = getMapper().deleteById(id);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return -1;
        }
    }

    public int updateByEntity(T entity) {
        try {
            int rs = getMapper().updateByEntity(entity);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return -1;
        }
    }

    public List<T> getAll(Map<String, Object> searchMap) {
        try {
            List<T> result = getMapper().getAll(searchMap);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return null;
        }
    }

    public T selectById(PK id) {
        try {
            T result = getMapper().selectById(id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return null;
        }
    }

}
