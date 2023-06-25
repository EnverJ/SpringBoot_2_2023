package com.example.demo.domain.service.impl;

import com.example.demo.domain.model.MUser;
import com.example.demo.domain.service.UserService;
import com.example.demo.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper mapper;

  /**User signup */
  @Override
  public void signup(MUser user) {
    user.setDepartmentId(1);
    user.setRole("ROLE_GENERAL");
    mapper.insertOne(user);
  }
}
