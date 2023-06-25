package com.example.demo.repository;

import com.example.demo.domain.model.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  /** User Signup */
  public int insertOne(MUser user);
}
