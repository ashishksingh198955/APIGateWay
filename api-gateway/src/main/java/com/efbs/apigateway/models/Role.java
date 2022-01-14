package com.efbs.apigateway.models;

import javax.persistence.*;

import com.efbs.apigateway.utils.ApplicationTableConstants;


@Entity
@Table(name = com.efbs.apigateway.utils.ApplicationTableConstants.ROLE_MASTER)
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ApplicationTableConstants.ROLE_ID)
	private Integer roleid;

//	@Enumerated(EnumType.STRING)
    @Column(name = ApplicationTableConstants.ROLE_NAME)
	private String rolename;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

//	public ERole getRolename() {
//		return rolename;
//	}
//
//	public void setRolename(ERole rolename) {
//		this.rolename = rolename;
//	}
//
//	public Role(Integer roleid, ERole rolename) {
//		this.roleid = roleid;
//		this.rolename = rolename;
//	}

	public Role() {
		
	}

	public Role(Integer roleid, String rolename) {
	super();
	this.roleid = roleid;
	this.rolename = rolename;
}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + "]";
	}

	
}