package com.vlearn.facebookrestapi;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;




public class Interaction {
	
	private Profile profile;
	private String keyword;
	StringBuffer response ;
	
	public Interaction (Profile profile,String keyword){
		
		this.profile = profile;
		this.keyword = keyword;
		StringBuffer response = new StringBuffer();
		
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String interact(Profile profile,String keyword){
		
		String out;
		switch (keyword){
		
			case "notifications":
				
				out = getNotifications(profile);
				break;
		
			default:
				out =  "default case";
				
				break;
		
		
		}
		
		return out;
		
	}
	
	private String getNotifications(Profile profile){
		
		
		
		
		HttpURLConnectionExample http = new HttpURLConnectionExample();
		
		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		
		
		return response;
		
	}

	// HTTP GET request
		private void sendGet() throws Exception {

			//String url = "http://www.google.com/search?q=mkyong";
			
			String url = "https://graph.facebook.com/v2.2/me/notifications?access_token=" + profile.getToken;
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			//con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());
			

		}

	

}
