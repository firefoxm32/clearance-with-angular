/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.local.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author Roudhentel
 */
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport {
	@Autowired
	public void hibernateDaoSupporter(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
}
