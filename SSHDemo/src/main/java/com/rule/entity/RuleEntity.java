package com.rule.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by rain on 2017/1/31.
 */
@Entity
@Table(name = "rule", schema = "rule_engine", catalog = "")
public class RuleEntity {
    private int id;
    private Integer userId;
    private Integer clientId;
    private String crontab;
    private String logExp;
    private String logTopic;
    private String rules;
    private Timestamp createTime;
    private Integer isEnabled;
    private Timestamp updateTime;
    private String name;
    private String description;

    public RuleEntity(){}

    //插入数据库
    public RuleEntity(Integer userId, String crontab, String logExp, String logTopic,
                      String rules, String name, String description) {
        this.userId = userId;
        this.crontab = crontab;
        this.logExp = logExp;
        this.logTopic = logTopic;
        this.rules = rules;
        this.name = name;
        this.description = description;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "clientId")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "crontab")
    public String getCrontab() {
        return crontab;
    }

    public void setCrontab(String crontab) {
        this.crontab = crontab;
    }

    @Basic
    @Column(name = "logExp")
    public String getLogExp() {
        return logExp;
    }

    public void setLogExp(String logExp) {
        this.logExp = logExp;
    }

    @Basic
    @Column(name = "logTopic")
    public String getLogTopic() {
        return logTopic;
    }

    public void setLogTopic(String logTopic) {
        this.logTopic = logTopic;
    }

    @Basic
    @Column(name = "rules")
    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "isEnabled")
    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Basic
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RuleEntity that = (RuleEntity) o;

        if (id != that.id) return false;
        if (isEnabled != that.isEnabled) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (crontab != null ? !crontab.equals(that.crontab) : that.crontab != null) return false;
        if (logExp != null ? !logExp.equals(that.logExp) : that.logExp != null) return false;
        if (logTopic != null ? !logTopic.equals(that.logTopic) : that.logTopic != null) return false;
        if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (crontab != null ? crontab.hashCode() : 0);
        result = 31 * result + (logExp != null ? logExp.hashCode() : 0);
        result = 31 * result + (logTopic != null ? logTopic.hashCode() : 0);
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (int) isEnabled;
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
