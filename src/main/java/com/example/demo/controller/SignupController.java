package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SignupController {
  @Autowired
  private UserApplicationService userApplicationService;

  /* Display the user sign up screen */
  @GetMapping("/signup")
  public void getSignup(Model model) {}
}
