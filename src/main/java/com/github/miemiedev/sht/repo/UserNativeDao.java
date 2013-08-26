package com.github.miemiedev.sht.repo;


import com.github.miemiedev.sht.entity.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserNativeDao  {
    @PersistenceContext
    private EntityManager entityManager;

    public List findAll(){
        //List list = entityManager.createNamedQuery("findAll").setFirstResult(3).setMaxResults(10).getResultList();
        Session session = ((Session)entityManager.getDelegate());
        List list = session.getNamedQuery("findAll").setFirstResult(3).setMaxResults(10).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        return  list;
    }
}
