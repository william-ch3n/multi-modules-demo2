package com.william.base.domain2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.william.base.domain2.entity.User;

@Mapper
public interface UserMapper {

	List<User>getAllUsers();
}
