package com.conssc.entity;

import java.sql.Date;
import java.util.Objects;

public class UserInfo {

	private Integer uid;
	private String name;
	private String pwd;
	private String company;
	private Date regdate;
	
	public UserInfo() {
	}
	public UserInfo(int uid, String name, String pwd, String company, Date regdate) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.company = company;
		this.regdate = regdate;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", company=" + company + ", regdate="
				+ regdate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(uid,name,pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		UserInfo userInfo=(UserInfo)obj;
		return Objects.equals(uid, userInfo.uid) &&
				 Objects.equals(name,userInfo.name)  &&
				 Objects.equals(pwd,userInfo.pwd);
				
	
	}
	




}

