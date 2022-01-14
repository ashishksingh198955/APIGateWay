package com.efbs.apigateway.utils;

/**
 * The <code>ApplicationRegExConstants</code> class holds application RegEx details used the application.
 *
 * @author Ashish Kumar Singh
 *
 */
public final class ApplicationRegExConstants {
	
	public static final String EMAIL_REGEX = "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
			+ "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
			+ "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
			+ "([a-zA-Z0-9]+[\\w-]+\\.)+[a-zA-Z]{1}[a-zA-Z0-9-]{1,23})| |$";

	public static final String DATE_REGEX = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";

	public static final String CONTACTNUMBER_REGEX = "^[+][1-9][0-9]{11}$";
	
	public static final String INTERNATIONAL_PHONE_NUMBERS = "^\\+(?:[0-9] ?){6,14}[0-9]$";
	
	public static final String TEN_DIGIT_CONTACT_NUMBER = "^[1-9][0-9]{9,12}";

	public static final String ALPHABETS_DIGITS_ONLY = "^[A-Za-z0-9]*$";

	public static final String GROUP_NAME_PATTERN = "^[A-Za-z0-9\\-_ ]*$";

	public static final String ALPHABETS_ONLY = "^[A-Za-z]*$";

	public static final String DIGITS_ONLY = "^[0-9]*$";

	public static final String PASSWORD_REGEX = "((?=.*[a-zA-Z])(?=.*[\\d!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]).{8,32})";

	// only String and Space allow.
	public static final String ALPHABETS_WITH_SPACE_ONLY = "^[a-zA-Z_ ]*$";

	// only specific image allow
	public static final String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|jpeg))$)";

	public static final String IMAGE_PATTERN_COMPLIANCE = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|jpeg|pdf))$)";

	// split forward slash or question mark
	public static final String SPLIT_URL = "/|\\?";

	public static final String GENDER_REGEX = "^(?:([fF][eE])?[mM][aA][lL][eE])$";

	public static final String VEHICLEYEAR_REGEX = "^[0-9]{4}$";
	
	private ApplicationRegExConstants() {

	}
}