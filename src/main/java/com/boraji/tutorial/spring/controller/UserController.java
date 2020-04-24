package com.boraji.tutorial.spring.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boraji.pojo.Userpojo;
import com.boraji.tutorial.spring.model.User;
import com.boraji.tutorial.spring.service.UserService;

/**
 * @author imssbora
 */
@Controller
public class UserController {

   @Autowired
   private UserService userService;

   @GetMapping("/")
   public String userForm(Locale locale, Model model) {

      model.addAttribute("user", new User());
      model.addAttribute("users", userService.list());

      return "userForm";
   }

   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute @Valid Userpojo userpojo,
         BindingResult result, Model model) {

      if (result.hasErrors()) {
         
         model.addAttribute("users", userService.list());
         return "userForm";
      }

      userService.save(userpojo);

      return "redirect:/";
   }
}
