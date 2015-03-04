package com.gwt.presistence.dao;

import com.gwt.presistence.entity.Ofuser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Transaction;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 30 on 2015/3/4.
 */
public class UserDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Ofuser> getAllUser(){
        String hsql = "from Ofuser ";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
    }
}
