package com.jdbctemplate;

public class User {

	private Integer adminID;
	private String adminName;

	public Integer getAdminID() {
		return adminID;
	}
	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String toString() {
		return "User [adminID=" + adminID + ", adminName=" + adminName + "]";
	}

}
