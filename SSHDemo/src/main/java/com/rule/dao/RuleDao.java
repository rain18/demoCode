package com.rule.dao;

import com.rule.entity.RuleEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/1/31.
 */
public interface RuleDao extends GenericDao<RuleEntity,Integer>{
    List<RuleEntity> findAll(Integer startRaw, Integer size);
    List<RuleEntity> query(Map<String, Object> searchMap, Integer startRaw, Integer size);
}
