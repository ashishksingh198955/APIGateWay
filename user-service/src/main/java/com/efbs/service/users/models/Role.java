package com.efbs.service.users.models;

import javax.persistence.*;

import com.efbs.service.users.utils.ApplicationTableConstants;

@Entity
@Table(name = ApplicationTableConstants.ROLE_MASTER)
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ApplicationTableConstants.ROLE_ID)
	private Integer roleid;

	@Enumerated(EnumType.STRING)
    @Column(name = ApplicationTableConstants.ROLE_NAME)
	private ERole rolename;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public ERole getRolename() {
		return rolename;
	}

	public void setRolename(ERole rolename) {
		this.rolename = rolename;
	}

	public Role(Integer roleid, ERole rolename) {
		this.roleid = roleid;
		this.rolename = rolename;
	}

	public Role() {
		
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + "]";
	}

	
}