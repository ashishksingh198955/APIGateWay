
package com.efbs.service.users.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.efbs.service.users.utils.ApplicationTableConstants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * This <code>UserRoles</code> class is responsible for set and get UserRoles
 *
 * @author Ashish Kumar Singh
 */
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = ApplicationTableConstants.USER_ROLES)
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ApplicationTableConstants.USER_ROLES_ID)
	private Long userRolesId;

	@Column(name = ApplicationTableConstants.USER_PROFILE_INFO_ID)
	private Long userId;

	@Column(name = ApplicationTableConstants.ROLE_ID)
	private long roleId;

	@Column(name = ApplicationTableConstants.IS_ACTIVE)
	private Boolean isActive;

	@Column(name = ApplicationTableConstants.COMPANY_ID)
	private Long companyId;





}
