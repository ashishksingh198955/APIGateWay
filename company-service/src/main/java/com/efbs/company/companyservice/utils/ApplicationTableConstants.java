package com.efbs.company.companyservice.utils;
/**
 * The <code>ApplicationTableConstants</code> class holds entity mapping constants.
 *
 * @author Ashish Kumar Singh
 *
 */
public final class ApplicationTableConstants {

	/* LoginRequest */
	
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	public static final String STATUS = "status";

	/* UserProfileInfo */
	public static final String USER_PROFILE_INFO = "userprofileinfo";
	public static final String USER_PROFILE_INFO_ID = "userprofileinfoid";
	public static final String FIRST_NAME = "firstname";
	public static final String LAST_NAME = "lastname";
	public static final String MIDDLE_NAME = "middlename";
	public static final String POSTION = "position";
	public static final String ADDRESS_LINE_2 = "addressline2";
	public static final String CONTACT = "contact";
	public static final String GENDER = "gender";
	public static final String DIVISION = "division";


	/* AuditModel */
	public static final String CREATED_DATE_TIME = "createdatetime";
	public static final String CREATED_BY = "createdby";
	public static final String AUDITED_BY = "auditedby";
	public static final String AUDITED_DATE_TIME = "auditeddatetime";

	/* UserRoles */
	public static final String USER_ROLES = "userroles";
	public static final String USER_ROLES_ID = "userrolesid";
	public static final String IS_ACTIVE = "isactive";
	public static final String USER_ID = "userid";

	/* CompanyInfo */
	public static final String COMPANY_INFO = "companyinfo";
	public static final String COMPANY_ID = "companyid";
	public static final String COMPANY_NAME = "companyname";
	public static final String COMPANY_ADDRESS = "companyaddress";
	public static final String COMPANY_SIZE = "companysize";
	public static final String COMPANY_WEBSITE = "companywebsite";


	/* RoleMaster */
	public static final String ROLE_MASTER = "rolemaster";
	public static final String ROLE_ID = "roleid";
	public static final String ROLE_NAME = "rolename";



	private ApplicationTableConstants() {

	}

}