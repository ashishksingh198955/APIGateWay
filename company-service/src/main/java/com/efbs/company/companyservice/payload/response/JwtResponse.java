//package com.efbs.service.users.payload.response;
//
//import java.util.List;
//
//public class JwtResponse {
//	private String token;
//	private String type = "Bearer";
//	private Long getUserprofileinfoid;
//	private String username;
//	private Long companyid;
//
//	private String email;
//	private List<String> roles;
//
//	public JwtResponse(String accessToken, Long getUserprofileinfoid, String username,Long companyid, String email, List<String> roles) {
//		this.token = accessToken;
//		this.getUserprofileinfoid = getUserprofileinfoid;
//		this.username = username;
//		this.companyid = companyid;
//		this.email = email;
//		this.roles = roles;
//	}
//	public Long getUserprofileinfoid() {
//		return getUserprofileinfoid;
//	}
//
//	public void setUserprofileinfoid(Long getUserprofileinfoid) {
//		this.getUserprofileinfoid = getUserprofileinfoid;
//	}
//	public String getAccessToken() {
//		return token;
//	}
//
//	public void setAccessToken(String accessToken) {
//		this.token = accessToken;
//	}
//
//	public String getTokenType() {
//		return type;
//	}
//
//	public void setTokenType(String tokenType) {
//		this.type = tokenType;
//	}
//	
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public Long getCompanyid() {
//		return companyid;
//	}
//
//	public void setCompanyid(Long companyid) {
//		this.companyid = companyid;
//	}
//
//	public List<String> getRoles() {
//		return roles;
//	}
//}
