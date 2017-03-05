package com.rule.service.impl;

import com.rule.dao.RuleDao;
import com.rule.entity.RuleEntity;
import com.rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/1/31.
 */
@Repository(value = "ruleService")
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleDao ruleDao;

    public RuleEntity get(Integer id) {
        return ruleDao.get(id);
    }

    public List<RuleEntity> getAll() {
        return ruleDao.getAll();
    }

    public void save(RuleEntity entity) {
        ruleDao.save(entity);
    }

    public void update(RuleEntity entity) {
        ruleDao.update(entity);
    }

    public void delete(Integer id) {
        ruleDao.delete(id);
    }

    public RuleEntity load(Integer id) {
        return ruleDao.load(id);
    }

    public List<RuleEntity> findAll(Integer startRaw, Integer size) {
        return ruleDao.findAll(startRaw,size);
    }

    public List<RuleEntity> query(Map<String, Object> searchMap, Integer startRaw, Integer size) {
        return ruleDao.query(searchMap, startRaw, size);
    }

    public void saveOrUpdate(RuleEntity entity) {
        ruleDao.saveOrUpdate(entity);
    }
}
