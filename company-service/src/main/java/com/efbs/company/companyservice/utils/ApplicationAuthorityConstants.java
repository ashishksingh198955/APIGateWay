
package com.efbs.company.companyservice.utils;

/**
 * The <code>ApplicationAuthorityConstants</code> class holds authority constants used the application.
 *
 * @author Ashish Kumar Singh
 *
 */
public final class ApplicationAuthorityConstants {

	private ApplicationAuthorityConstants() {

	}

//	public static final String BASE_API = "/api";
//
//	public static final String USER_AUTHENTICATION = "/auth/signin";
//	
//	public static final String ID_PATH_VARIABLE = "/{id}";
//
//	public static final String REGISTER_COMPANY_BY_SYSTEM_ADMIN = "/registercompanybysystemadmin";
//	
//	public static final String ADD_USER_BY_SYSTEM_ADMIN = "/adduserbysystemadmin";

	public static final String HAS_SYSTEM_ADMIN_ROLE = "hasRole('ROLE_SYSTEM_ADMIN')";
	
	public static final String HAS_ROLE_COMPANY_ADMIN = "hasRole('ROLE_COMPANY_ADMIN')";
	
	public static final String HAS_ROLE_COMPANY_HR = "hasRole('ROLE_COMPANY_HR')";

	public static final String HAS_ROLE_ALL = "hasRole('ROLE_SYSTEM_ADMIN') or hasRole('ROLE_COMPANY_ADMIN') or hasRole('ROLE_COMPANY_HR')";


}