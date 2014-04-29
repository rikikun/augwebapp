package com.aug.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUserAction extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// all struts logic here
	public String execute() {
		if(!username.equals(password)){
			return "ERROR";
		}
		return "SUCCESS";
	}

	public String Login() {
		return "SUCCESS";
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		if(username.equals("")||username.equals(null)){
			addFieldError("username", "username but not null");
		}
	//	System.out.print(dp.getDepart());
		if(password.equals("")||password.equals(null)){
			addFieldError("password", "password but not null");
		}
	}
}