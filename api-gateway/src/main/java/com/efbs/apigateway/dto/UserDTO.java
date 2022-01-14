package com.efbs.apigateway.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.efbs.apigateway.models.Role;


public class UserDTO {

    private Long userid;
	private String firstname;
	private List<Role> roles;
	private String middlename;

	private String lastname;

	private String gender;

	private String position;

	private String contact;

	private Long companyid;

	private long createdby;

	private Date createdatetime;

	private Date auditeddatetime;

	private long auditedby;

	private String password;

	private String email;
	
	private String username;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(long createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedatetime() {
		return createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	public Date getAuditeddatetime() {
		return auditeddatetime;
	}

	public void setAuditeddatetime(Date auditeddatetime) {
		this.auditeddatetime = auditeddatetime;
	}

	public long getAuditedby() {
		return auditedby;
	}

	public void setAuditedby(long auditedby) {
		this.auditedby = auditedby;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDTO(Long userid, String username,Long companyid ,String password,String email) {
		super();
		this.userid = userid;
		this.username = username;
//		this.roles = roles;
//		this.middlename = middlename;
//		this.lastname = lastname;
//		this.gender = gender;
//		this.position = position;
//		this.contact = contact;
		this.companyid = companyid;
//		this.createdby = createdby;
//		this.createdatetime = createdatetime;
//		this.auditeddatetime = auditeddatetime;
//		this.auditedby = auditedby;
		this.password = password;
		this.email = email;
//		this.username=username;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", firstname=" + firstname + ", roles=" + roles
				+ ", middlename=" + middlename + ", lastname=" + lastname + ", gender=" + gender + ", position="
				+ position + ", contact=" + contact + ", companyid=" + companyid + ", createdby=" + createdby
				+ ", createdatetime=" + createdatetime + ", auditeddatetime=" + auditeddatetime + ", auditedby="
				+ auditedby + ", password=" + password + ", email=" + email + ", username=" + username + "]";
	}

	

	
	
}
