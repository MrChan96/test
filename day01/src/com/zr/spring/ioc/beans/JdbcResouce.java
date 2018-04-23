package com.zr.spring.ioc.beans;

public class JdbcResouce {
	private String driverClassName;
	private String url;
	private String password;
	private String username;

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
