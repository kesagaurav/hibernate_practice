package com.gaurav.dbutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Session ses;
	public static Configuration configuration = new Configuration().configure("hibernate.cfg");
	public static StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	public static SessionFactory sf = configuration.buildSessionFactory(builder.build());

	public  Session getSession() {

		if (ses == null) {
			ses = sf.openSession();
		}
		return ses;

	}

	public void closeSes() {
		ses.close();
		sf.close();
	}

}
