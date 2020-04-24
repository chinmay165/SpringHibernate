package com.boraji.tutorial.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boraji.pojo.Userpojo;
import com.boraji.tutorial.spring.model.User;

/**
 * @author imssbora
 */
@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(Userpojo user) {
	   User userenty = new User();
	   userenty.setName(user.getName());
	   userenty.setEmail(user.getEmail());
	   
      sessionFactory.getCurrentSession().save(userenty);
   }

   @Override
   public List<User> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

}
