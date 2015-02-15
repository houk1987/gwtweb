package com.gwt.presistence.utils;

import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

public class HibernateUtilsTest {

    @Test
    public void testGetSession() throws Exception {
        Session session = HibernateUtils.getInstance().getSession();
    }
}