package com.efbs.company.companyservice.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

import com.efbs.company.companyservice.utils.ApplicationConstants;
import com.efbs.company.companyservice.utils.ApplicationTableConstants;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(	name = com.efbs.company.companyservice.utils.ApplicationTableConstants.COMPANY_INFO)
public class Company implements Serializable {
	
	private static final long serialVersionUID = 8851505104868965779L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ApplicationTableConstants.COMPANY_ID)
	private Long companyid;

	@Column(name = ApplicationTableConstants.COMPANY_NAME)
	private String companyname;

	@Column(name = ApplicationTableConstants.COMPANY_ADDRESS)
	private String companyaddress;

	@Column(name = ApplicationTableConstants.COMPANY_WEBSITE)
	private String companywebsite;

	@Column(name = ApplicationTableConstants.COMPANY_SIZE)
	private Long companysize;

	@Column(name = ApplicationTableConstants.CREATED_BY)
	private long createdby;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ApplicationConstants.MM_DD_YYYY_HH_MM_SS_AM_PM)
	@Column(insertable = false, updatable = false, name = ApplicationTableConstants.CREATED_DATE_TIME)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
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

}
