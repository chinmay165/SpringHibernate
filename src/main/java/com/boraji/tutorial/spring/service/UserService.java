package com.boraji.tutorial.spring.service;

import java.util.List;

import com.boraji.pojo.Userpojo;
import com.boraji.tutorial.spring.model.User;

public interface UserService {
   void save(Userpojo userpojo);

   List<User> list();
}
