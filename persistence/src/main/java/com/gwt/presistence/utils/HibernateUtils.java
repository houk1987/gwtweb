package com.gwt.presistence.utils;

import com.gwt.presistence.entity.Ofuser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * Created by 30 on 2015/2/15.
 */
public class HibernateUtils {
    private static HibernateUtils hibernateUtils;

    private SessionFactory sessionFactory;

    public static HibernateUtils getInstance() {
        if (hibernateUtils == null) {
            hibernateUtils = new HibernateUtils();
        }
        return hibernateUtils;
    }

    private HibernateUtils() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main(String[] args) {
        Session session = HibernateUtils.getInstance().getSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        Ofuser ofuser = new Ofuser();
        ofuser.setUsername("123123213123");
        ofuser.setCreationDate("a");
        ofuser.setModificationDate("1");
        session.save(ofuser);
        tx.commit();
    }

}
