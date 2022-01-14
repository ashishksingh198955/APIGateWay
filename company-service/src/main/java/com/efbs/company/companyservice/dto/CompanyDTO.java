package com.efbs.company.companyservice.dto;

import java.util.Date;


public class CompanyDTO {

	 private Long companyid;
	 private String companyname;
	 private String companyaddress;

	 private String companywebsite;

	 private Long companysize;

	 private long createdby;

	 private Date createdatetime;

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getCompanywebsite() {
		return companywebsite;
	}

	public void setCompanywebsite(String companywebsite) {
		this.companywebsite = companywebsite;
	}

	public Long getCompanysize() {
		return companysize;
	}

	public void setCompanysize(Long companysize) {
		this.companysize = companysize;
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

	@Override
	public String toString() {
		return "CompanyDTO [companyid=" + companyid + ", companyname=" + companyname + ", companyaddress="
				+ companyaddress + ", companywebsite=" + companywebsite + ", companysize=" + companysize
				+ ", createdby=" + createdby + ", createdatetime=" + createdatetime + "]";
	}

	public CompanyDTO(Long companyid, String companyname, String companyaddress, String companywebsite,
			Long companysize, long createdby, Date createdatetime) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.companyaddress = companyaddress;
		this.companywebsite = companywebsite;
		this.companysize = companysize;
		this.createdby = createdby;
		this.createdatetime = createdatetime;
	}

	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
