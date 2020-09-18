package com.conssc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conssc.entity.WorkLeave;
import com.conssc.mapper.WorkLeaveMapper;
import com.conssc.service.WorkLeaveService;

@Service
public class WorkLeaveServiceImpl implements WorkLeaveService {
	@Autowired
	private WorkLeaveMapper workleavemapper;
	
	@Override
	public WorkLeave numLeaveService(String username) {
		WorkLeave workLeave=workleavemapper.numLeave(username);
		return workLeave;
	}

}
