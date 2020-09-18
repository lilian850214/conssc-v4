package com.conssc.service;

import java.io.IOException;

import com.conssc.entity.UserInfo;


public interface UserLoginService {
//用户登录服务
	UserInfo userLoginService(String username,String pwd) throws  IOException;
	
}
