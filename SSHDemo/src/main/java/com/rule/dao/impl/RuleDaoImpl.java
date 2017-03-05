package com.rule.dao.impl;

import com.rule.dao.RuleDao;
import com.rule.entity.RuleEntity;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by rain on 2017/1/31.
 */
@Repository(value = "ruleDao")
public class RuleDaoImpl implements RuleDao {

    private static final Logger logger = Logger.getLogger(RuleDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public RuleEntity load(Integer id){
        return (RuleEntity)this.getCurrentSession().load(RuleEntity.class, id);
    }

    public RuleEntity get(Integer id) {
        return (RuleEntity)this.getCurrentSession().get(RuleEntity.class, id);
    }

    public List<RuleEntity> getAll() {
        Query query = this.getCurrentSession().createQuery("from RuleEntity");
        return query.list();
    }

    public List<RuleEntity> findAll(Integer startRaw, Integer size) {
        Query query = this.getCurrentSession().createQuery("from RuleEntity");
        if (startRaw == null) {
            startRaw = 0;
        }
        if (size == null) {
            size = 10;
        }
        query.setFirstResult(startRaw);
        query.setMaxResults(size);
        return query.list();
    }

    public List<RuleEntity> query(Map<String, Object> searchMap, Integer startRaw, Integer size) {
        String hql = "from RuleEntity";
        int top = 1;
        if (searchMap.size()>0) {
            hql += " where ";
            for (Map.Entry<String, Object> entry:searchMap.entrySet()) {
                if (top!=1) {
                    hql += " and ";
                }
                hql += entry.getKey()+"=:value"+entry.getKey();
                top++;
            }
        }
        Query query = this.getCurrentSession().createQuery(hql);
        for (Map.Entry<String, Object> entry:searchMap.entrySet()) {
            query.setParameter("value"+entry.getKey(), entry.getValue());
        }
        if (startRaw == null) {
            startRaw = 0;
        }
        if (size == null) {
            size = 10;
        }
        query.setFirstResult(startRaw);
        query.setMaxResults(size);
        return query.list();
    }


    public void save(RuleEntity entity) {
        this.getCurrentSession().save(entity);
        logger.info("save rule, result: " + this.getCurrentSession().save(entity));
    }

    public void update(RuleEntity entity) {
        this.getCurrentSession().update(entity);
    }

    public void saveOrUpdate(RuleEntity entity){
        this.getCurrentSession().saveOrUpdate(entity);
    }


    public void delete(Integer id) {
        RuleEntity entity = this.load(id);
        this.getCurrentSession().delete(entity);
    }
}
