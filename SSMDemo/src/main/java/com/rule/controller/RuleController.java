package com.rule.controller;

import com.rule.entity.Page;
import com.rule.entity.RuleEntity;
import com.rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/3/5.
 */
@Controller
@RequestMapping(value = "/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @RequestMapping(value = "/",method = {RequestMethod.GET})
    @ResponseBody
    public Page<RuleEntity> getAll(@RequestParam(value = "userId",required = true) Integer userId,
                                   @RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                                   @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        Map<String,Object> searchMap = new HashMap<>();
        searchMap.put("userId",userId);
        Page<RuleEntity> result = ruleService.getAllByMap(searchMap,pageNum,pageSize);
        return result;
    }

}
