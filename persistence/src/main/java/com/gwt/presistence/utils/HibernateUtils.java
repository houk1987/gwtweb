package com.gwt.presistence.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by 30 on 2015/2/15.
 */
public class HibernateUtils {

    private static HibernateUtils hibernateUtils;

    private Configuration configuration;

    private SessionFactory sessionFactory;


    public static HibernateUtils getInstance() {
        if (hibernateUtils == null){
            hibernateUtils = new HibernateUtils();
        }
        return hibernateUtils;
    }

    private HibernateUtils() {
        this.configuration = new Configuration();
        StandardServiceRegistryBuilder srb = new  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        StandardServiceRegistry sr = srb.build();
        this.sessionFactory = configuration.buildSessionFactory(sr);
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
