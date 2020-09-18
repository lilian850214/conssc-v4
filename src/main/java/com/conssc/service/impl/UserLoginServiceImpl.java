package com.conssc.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conssc.entity.UserInfo;
import com.conssc.mapper.UserLoginMapper;
import com.conssc.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserLoginMapper um;
	//用户登录
	@Override
	public UserInfo userLoginService(String username, String pwd) throws IOException {
		//查询数据库
		UserInfo userInfo=um.Login(username, pwd);
		//返回
		return userInfo ;
	}

	
	
	

}
