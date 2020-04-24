package com.boraji.tutorial.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boraji.pojo.Userpojo;
import com.boraji.tutorial.spring.dao.UserDao;
import com.boraji.tutorial.spring.model.User;

/**
 * @author imssbora
 *
 */
@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   public void save(Userpojo userpojo) {
      userDao.save(userpojo);
   }

   @Transactional(readOnly = true)
   public List<User> list() {
      return userDao.list();
   }

}
