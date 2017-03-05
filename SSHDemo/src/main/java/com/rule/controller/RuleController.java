package com.rule.controller;

import com.rule.entity.RuleEntity;
import com.rule.service.RuleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rain on 2017/3/5.
 */
@Controller
@RequestMapping(value = "/rule")
public class RuleController {

    private static final Logger logger = Logger.getLogger(RuleController.class);

    @Autowired
    private RuleService ruleService;

    @RequestMapping(value = "/{id}",method = {RequestMethod.GET})
    @ResponseBody
    public RuleEntity getRuleById(@PathVariable Integer id){
        try {
            RuleEntity result = ruleService.get(id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return null;
    }
}
