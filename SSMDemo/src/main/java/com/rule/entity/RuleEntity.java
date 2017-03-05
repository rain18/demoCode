package com.rule.entity;

import java.sql.Timestamp;
import java.util.Date;

public class RuleEntity {
    private Integer id;

    private Integer userid;

    private String crontab;

    private String logexp;

    private String logtopic;

    private Timestamp createtime;

    private Boolean isenabled;

    private Timestamp updatetime;

    private String name;

    private String description;

    private Integer clientid;

    private String rules;

    public RuleEntity(Integer id, Integer userid, String crontab, String logexp, String logtopic, Timestamp createtime, Boolean isenabled, Timestamp updatetime, String name, String description, Integer clientid, String rules) {
        this.id = id;
        this.userid = userid;
        this.crontab = crontab;
        this.logexp = logexp;
        this.logtopic = logtopic;
        this.createtime = createtime;
        this.isenabled = isenabled;
        this.updatetime = updatetime;
        this.name = name;
        this.description = description;
        this.clientid = clientid;
        this.rules = rules;
    }

    public RuleEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCrontab() {
        return crontab;
    }

    public void setCrontab(String crontab) {
        this.crontab = crontab == null ? null : crontab.trim();
    }

    public String getLogexp() {
        return logexp;
    }

    public void setLogexp(String logexp) {
        this.logexp = logexp == null ? null : logexp.trim();
    }

    public String getLogtopic() {
        return logtopic;
    }

    public void setLogtopic(String logtopic) {
        this.logtopic = logtopic == null ? null : logtopic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }
}