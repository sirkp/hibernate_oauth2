package com.example.hibernate.hibernateConnection;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    public static SessionFactory buildSessionFactory() 
    {
        try 
        {
            return new Configuration().configure(new File("hibernate.cgf.xml")).buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }
}
