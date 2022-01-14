package com.efbs.service.users.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.LastModifiedDate;

import com.efbs.service.users.utils.ApplicationConstants;
import com.efbs.service.users.utils.ApplicationTableConstants;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(	name = ApplicationTableConstants.USER_PROFILE_INFO)
public class User {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = ApplicationTableConstants.USER_PROFILE_INFO_ID)
	    private Long userid;

	    @Column(name = ApplicationTableConstants.FIRST_NAME)
	    private String firstname;

	    
	    @Column(name = ApplicationTableConstants.MIDDLE_NAME)
	    private String middlename;

	    @Column(name = ApplicationTableConstants.LAST_NAME)
	    private String lastname;
	    
	    @Column(name = ApplicationTableConstants.GENDER)
	    private String gender;
	    
	    @Column(name = ApplicationTableConstants.POSTION)
	    private String position;
	    
	    @Column(name = ApplicationTableConstants.DIVISION)
	    private String division;
	    
	    
	    @Column(name = ApplicationTableConstants.CONTACT)
	    private String contact;
	    
	    @Column(name = ApplicationTableConstants.COMPANY_ID)
	    private Long companyid;

	    @Column(name = ApplicationTableConstants.CREATED_BY)
		private long createdby;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ApplicationConstants.MM_DD_YYYY_HH_MM_SS_AM_PM)
		@Column(insertable = false, updatable = false, name = ApplicationTableConstants.CREATED_DATE_TIME)
		@Temporal(TemporalType.TIMESTAMP)
		@LastModifiedDate		
		private Date createdatetime;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ApplicationConstants.MM_DD_YYYY_HH_MM_SS)
		@Column(insertable = false, updatable = true, name = ApplicationTableConstants.AUDITED_DATE_TIME)
		@Temporal(TemporalType.TIMESTAMP)
		@LastModifiedDate
		private Date auditeddatetime;
		
		@Column(name = ApplicationTableConstants.AUDITED_BY)
		private long auditedby;

	    @Column(name = ApplicationTableConstants.PASSWORD)
	    private String password;
	    
	    @Column(name = ApplicationTableConstants.EMAIL)
	    private String email;
	  
	    @Transient
	    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "users_roles",
	            joinColumns = @JoinColumn(name = "userid"),
	            inverseJoinColumns = @JoinColumn(name = "roleid")
	            )
	    private Set<String> role = new HashSet<>();;
	    
	    
		@Column(name = ApplicationTableConstants.STATUS)
		private Boolean status;

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

		public Set<String> getRole() {
			return role;
		}

		public void setRole(Set<String> role) {
			this.role = role;
		}

		public String getDivision() {
			return division;
		}

		public void setDivision(String division) {
			this.division = division;
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "User [userid=" + userid + ", firstname=" + firstname + ", middlename="
					+ middlename + ", lastname=" + lastname + ", gender=" + gender + ", position=" + position
					+ ", division=" + division + ", contact=" + contact + ", companyid=" + companyid + ", createdby="
					+ createdby + ", createdatetime=" + createdatetime + ", auditeddatetime=" + auditeddatetime
					+ ", auditedby=" + auditedby + ", password=" + password + ", email=" + email + ", role=" + role
					+ ", status=" + status + "]";
		}
	    
	    
	    
}
