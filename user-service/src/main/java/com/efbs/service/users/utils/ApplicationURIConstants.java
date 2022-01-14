/*
 * Copyright (c) QuadProSoft.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without prior written consent of QuadProSoft.
 * This software is provided under the terms of a license between QuadProSoft and the recipient, and its use is subject to the terms of that license.
 */
package com.efbs.service.users.utils;

/**
 * The <code>ApplicationURIConstants</code> class holds URI constants used the application.
 *
 * @author Ashish Kumar Singh
 *
 */
public final class ApplicationURIConstants {

	private ApplicationURIConstants() {

	}

	public static final String BASE_API = "/api";

	public static final String USER_AUTHENTICATION = "/auth/signin";
	
	public static final String ID_PATH_VARIABLE = "/{id}";

	public static final String REGISTER_COMPANY_BY_SYSTEM_ADMIN = "/user/registercompanybysystemadmin";
	
	public static final String ADD_USER_BY_SYSTEM_ADMIN = "adduser";
	public static final String ADD_USER_BY_COMPANY_ADMIN_AND_COMPANY_HR = "addemployee";


	public static final String LIST_OF_EMPLOYEE = "/getlistofemployeebycompanyhr";


}