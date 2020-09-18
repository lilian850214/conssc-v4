package com.conssc.mapper;

import org.apache.ibatis.annotations.Select;

import com.conssc.entity.WorkLeave;

public interface WorkLeaveMapper {
	//用户登录
		@Select("select * from work_leave where uid=#{param}")
		WorkLeave numLeave(String username);

}
