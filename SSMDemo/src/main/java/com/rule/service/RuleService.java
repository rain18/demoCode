package com.rule.service;

import com.rule.entity.RuleEntity;
import com.rule.mapper.BasicMapper;
import com.rule.mapper.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rain on 2017/3/5.
 */
@Service
public class RuleService extends BasicService<RuleEntity, Integer>{

    @Autowired
    private RuleMapper ruleMapper;

    @Override
    protected BasicMapper<RuleEntity, Integer> getMapper() {
        return ruleMapper;
    }
}
