package com.gwt.presistence.utils;

import com.gwt.presistence.Ofuserentity;
import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilsTest {

    @Test
    public void testGetSession() throws Exception {
        Session session = HibernateUtils.getInstance().getSession();
        Ofuserentity ofuserentity = new Ofuserentity();
        ofuserentity.setUsername("1");
        session.delete(ofuserentity);
    }
}