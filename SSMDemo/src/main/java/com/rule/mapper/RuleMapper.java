package com.rule.mapper;

import com.rule.entity.RuleEntity;
import org.mybatis.spring.annotation.MapperScan;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/3/5.
 */
@MapperScan
public interface RuleMapper extends BasicMapper<RuleEntity, Integer>{
    //如果有其他的需要，添加新的方法即可
    List<RuleEntity> getAllByMap(Map<String, Object> searchMap) throws SQLException;

}
