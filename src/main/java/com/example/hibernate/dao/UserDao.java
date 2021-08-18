package com.example.hibernate.dao;

import java.util.List;

import com.example.hibernate.entities.UserEntity;
import com.example.hibernate.hibernateConnection.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    
    public void save() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        UserEntity user = new UserEntity();
		user.setEmail("lokesh@mail.com");
		user.setFirstName("lokesh");
		user.setLastName("gupta");
		session.save(user);
        session.getTransaction().commit();
        session.close();
		HibernateUtil.shutdown();
    }

}