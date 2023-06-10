package com.example.demo.controller;

import com.example.demo.form.SignupForm;
import java.util.Locale;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@Slf4j
public class SignupController {
  @Autowired
  private UserApplicationService userApplicationService;

  /* Display the user sign up screen */
  @GetMapping("/signup")
  public String getSignup(
    Model model,
    Locale locale,
    @ModelAttribute SignupForm form
  ) {
    //get Gender
    Map<String, Integer> genderMap = userApplicationService.getGenderMap(
      locale
    );
    model.addAttribute("genderMap", genderMap);

    //Translation to user signup screen
    return "user/signup";
  }

  /*User signup process */
  @PostMapping("/signup")
  public String postSignup(@ModelAttribute SignupForm form) {
    log.info(form.toString());
    //redirect tp login page
    return "redirect:/login";
  }
}
