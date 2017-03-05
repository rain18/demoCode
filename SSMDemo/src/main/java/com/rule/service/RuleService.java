package com.rule.service;

import com.github.pagehelper.PageHelper;
import com.rule.entity.Page;
import com.rule.entity.RuleEntity;
import com.rule.mapper.BasicMapper;
import com.rule.mapper.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public Page<RuleEntity> getAllByMap(Map<String,Object> searchMap, int pageNum, int pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<RuleEntity> result = ruleMapper.getAllByMap(searchMap);
            return new Page<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
