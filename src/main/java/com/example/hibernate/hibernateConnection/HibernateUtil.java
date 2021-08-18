package com.example.hibernate.hibernateConnection;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@org.springframework.context.annotation.Configuration
public class HibernateUtil {

    @Bean
    public static SessionFactory getSessionFactory() {
        try {
            return new Configuration().configure(new File("hibernate.cgf.xml")).buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static void shutdown() {
    	// Close caches and connection pools
    	// getSessionFactory().close();
    }
}
