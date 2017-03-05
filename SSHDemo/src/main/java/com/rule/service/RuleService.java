package com.rule.service;

import com.rule.entity.RuleEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/2/2.
 */
public interface RuleService extends GenericService<RuleEntity,Integer> {
    List<RuleEntity> findAll(Integer startRaw, Integer size);
    List<RuleEntity> query(Map<String, Object> searchMap, Integer startRaw, Integer size);
}
