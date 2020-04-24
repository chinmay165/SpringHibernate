package com.boraji.tutorial.spring.dao;

import java.util.List;

import com.boraji.pojo.Userpojo;
import com.boraji.tutorial.spring.model.User;

public interface UserDao {
   void save(Userpojo userpojo);
   List<User> list();
}
