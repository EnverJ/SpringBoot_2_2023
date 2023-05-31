package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {
  @Autowired
  private HelloService service;

  @GetMapping("/hello")
  public String getHello() {
    // screen transition to hello.html
    return "hello";
  }

  @PostMapping("/hello")
  public String postRequest(@RequestParam("text1") String str, Model model) {
    // Register the String received from the screen to Model
    model.addAttribute("sample", str);
    return "hello/response";
  }

  @PostMapping("/hello/db")
  public String postDbRequest(@RequestParam("text2") String id, Model model) {
    //search one
    Employee employee = service.getEmployee(id);

    //save Search Result to Model
    model.addAttribute("employee", employee);
    //screen transition to db.html
    return "hello/db";
  }
}
