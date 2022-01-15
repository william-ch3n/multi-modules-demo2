package com.william.demo.api2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.william.demo.api2.service.UserService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/all")
	public String getAllUser() {
		System.out.println(JSON.toJSONString(userService.getAllUsers()));
		return JSON.toJSONString(userService.getAllUsers());
	}
	
}
