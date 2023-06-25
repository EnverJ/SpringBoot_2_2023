package com.example.demo.controller;

import com.example.demo.domain.model.MUser;
import com.example.demo.domain.service.UserService;
import com.example.demo.form.GroupOrder;
import com.example.demo.form.SignupForm;
import java.util.Locale;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {
  @Autowired
  private UserApplicationService userApplicationService;

  @Autowired
  private UserService userService;

  @Autowired
  private ModelMapper modelMapper;

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
  public String postSignup(
    Model model,
    Locale locale,
    @ModelAttribute @Validated(GroupOrder.class) SignupForm form,
    BindingResult bindingResult
  ) {
    //input Check Result
    if (bindingResult.hasErrors()) {
      //NG: Return to the user sign up screen
      return getSignup(model, locale, form);
    }
    log.info(form.toString());

    //convert from MUser class
    MUser user = modelMapper.map(form, MUser.class);

    //user signup
    userService.signup(user);
    //redirect tp login page
    return "redirect:/login";
  }
}
