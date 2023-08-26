package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure("com/hibernate/config/hibernate.cfg.xml")
					.buildSessionFactory();

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	private SessionUtil() {

	}

	public static Session getThreadLocalSession() {
		Session session = (Session) threadLocal.get();
		if (session == null) {
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}

	public static void closeThreadLocalSession(Session session) {
		Session session1 = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session1 != null) {
			session1.close();
		}
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
}
