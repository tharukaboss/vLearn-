package com.vlearn.facebookrestapi;

public class FacebookCredentials {
	private String username;
	private String password;
	private String token;
	
	public FacebookCredentials(String username,String password,String token){
		
		this.username = username;
		this.password = password;
		this.token = token;
		
	}
	
	
	public void setPassword(String password){
		
		this.password = password;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
	

}
