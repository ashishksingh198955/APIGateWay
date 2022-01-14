package com.efbs.company.companyservice.utils;

/**
 * The <code>ApplicationConstants</code> class holds application constants used the application.
 *
 * @author Ashish Kumar Singh
 *
 */
public final class ApplicationConstants {

	public static final String METHOD_ENTER_LABEL = "Enter";
	public static final String METHOD_EXIT_LABEL = "Exit";
	public static final String METHOD_CALLED_LABEL = "Called";
	public static final String METHOD_EXCEPTION_LABEL = "Exception : ";

	public static final String ERROR_LABEL = "error";
	public static final String SUCCESS_LABEL = "success";
	public static final String INACTIVE_USER = "User has not been activated";
	public static final String USER_EMAIL_EXIST = "Email is already exist";

	public static final int STACK_TRACE_THREAD_NUMBER = 1;

	public static final String ERROR_PAGE_TITLE = "Error!";

	public static final String SLASH_T_LABEL = "\t";
	public static final String EMPTY_STRING_LABEL = "";
	public static final String ERROR_VIEW = "error";

	/* Application constants-end */

	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";


	// Exceptions
	public static final String NUMBER_FORMAT_EXCEPTION = "NumberFormatExcetion";

	// ERRORS
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final String INVALID_CREDENTIALS = "Invalid Credentials.";
	public static final String FORBIDDEN = "You don't have permission to access / on this server";
	public static final String USER_NOT_FOUND = "User Not Found with -> username or email: ";
	public static final String UNAUTHORIZED = "Full authentication is required to access this resource";
	public static final String ROLE_NOT_FOUND = "Role Not Found with ";
	public static final String USER_ADD_SUCCESS = "User has been added successfully";
	public static final String COMPANY_ADD_SUCCESS = "Company has been registered successfully";


	public static final String USERPROFILE_INFO_ID_NOT_FOUND = "UserProfileInfoId Not Found with ";
	public static final String MM_DD_YYYY_HH_MM_SS_AM_PM = "MM-dd-YYYY hh:mm:ss a";
	public static final String MM_DD_YYYY_HH_MM_SS = "MM-dd-YYYY HH:mm:ss";
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String MM_DD_YYYY = "MM-DD-YYYY";
	public static final String NO_RECORD_FOUND = "No record found for the given data";

	public static final String ID = "id";

	// Common Http error messages - Start
	public static final String HTTP_ERROR_MESSAGE_200 = "Resource retrieved successfully";
	public static final String HTTP_ERROR_MESSAGE_201 = "Resource created successfully";
	public static final String HTTP_ERROR_MESSAGE_400 = "The request cannot be fulfilled due to bad syntax";
	public static final String HTTP_ERROR_MESSAGE_401 = "You are not authorized to view the resource";
	public static final String HTTP_ERROR_MESSAGE_403 = "The request was a legal request, but the server is refusing to respond to it";
	public static final String HTTP_ERROR_MESSAGE_404 = "Bad request ! No data found for your requested";
	public static final String HTTP_ERROR_MESSAGE_405 = "A request was made of a page using a request method not supported by that page";
	public static final String HTTP_ERROR_MESSAGE_500 = "Application has encountered an Internal server error";
	public static final String HTTP_ERROR_MESSAGE_503 = "Service Unavailable. The server is currently unable to handle the request due to a temporary overloading or maintenance of the server";
	public static final String STRING_LABEL = "String";
	public static final String REGISTER_METHOD = "registerUser";

	private ApplicationConstants() {

	}

}