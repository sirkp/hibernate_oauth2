package com.example.hibernate.dao;

import java.util.List;

import com.example.hibernate.entities.UserEntity;
import com.example.hibernate.hibernateConnection.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
   
    @Autowired
    private SessionFactory sessionFactory;
    
    public void save() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        UserEntity user = new UserEntity();
		user.setEmail("pradeep@mail.com");
		user.setFirstName("Pradeep");
		user.setLastName("Rahul");
		session.save(user);
        session.getTransaction().commit();
        session.close();
		// HibernateUtil.shutdown();
    }

    public List<UserEntity> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<UserEntity> users = session.createQuery("from UserEntity", UserEntity.class).list();
        session.getTransaction().commit();
        session.close();
        return users;
    }

}
