package com.conssc.mapper;

import org.apache.ibatis.annotations.Select;

import com.conssc.entity.UserInfo;

public interface UserLoginMapper {
	//用户登录
	@Select("select * from user_info where name=#{param1} and pwd=#{param2}")
	UserInfo Login(String username,String pwd);

}
