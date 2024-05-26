package com.dev.user.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.user.vo.UserVo;

@RestController
public class UserController {
	
	@GetMapping("/")
	public List<UserVo> getUserList() {
		UserVo user = new UserVo();
		user.setUserName("Duy Anh");
		user.setUserId("ndanh4");
		user.setEmail("duyanh2812@gmail.com");
		return new ArrayList<>(Arrays.asList(user));
	}
}
