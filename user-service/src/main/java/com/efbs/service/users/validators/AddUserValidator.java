package com.efbs.service.users.validators;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.efbs.service.users.dto.UserDTO;
import com.efbs.service.users.models.User;
import com.efbs.service.users.utils.ApplicationConstants;
import com.efbs.service.users.utils.ApplicationRegExConstants;



/**
 * The <code>AddUserValidator</code> class is responsible for validating user that is added to group.
 *
 * @author Ashish Kumar Singh
 *
 */
@Component
public class AddUserValidator extends BaseValidator implements Validator {

	private static final Logger LOGGER = LoggerFactory.getLogger(AddUserValidator.class);

	private static final String FIRST_NAME = "firstname";
	private static final String LAST_NAME = "lastname";
	private static final String CONTACT = "contact";
	private static final String EMAIL = "email";

	@Override
	public void validate(final Object target, final Errors errors) {

		LOGGER.info(ApplicationConstants.METHOD_CALLED_LABEL);

		final Pattern patternForALphabets = Pattern.compile(ApplicationRegExConstants.ALPHABETS_ONLY);
		final Pattern patternForContact = Pattern.compile(ApplicationRegExConstants.TEN_DIGIT_CONTACT_NUMBER);
		final Pattern patternForEmail = Pattern.compile(ApplicationRegExConstants.EMAIL_REGEX);

		final User user = (User) target;

		// Step 1 Set the errors object in parent
		setErrors(errors);

		// Step 2 Validate Not Empty and Not Null Values
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIRST_NAME, NOTEMPTY);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, LAST_NAME, NOTEMPTY);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, CONTACT, NOTEMPTY);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, EMAIL, NOTEMPTY);

		if (!errors.hasErrors()) {

			validateMaxLength(FIRST_NAME, user.getFirstname().length(), 50);
			validateMaxLength(LAST_NAME, user.getLastname().length(), 50);
			validateMaxLength(CONTACT, user.getContact().length(), 15);
			validateMaxLength(EMAIL, user.getEmail().length(), 60);

			validateAgainstPattern(patternForALphabets, user.getFirstname(), FIRST_NAME);
			validateAgainstPattern(patternForALphabets, user.getLastname(), LAST_NAME);
			validateAgainstPattern(patternForContact, user.getContact(), CONTACT);
			validateAgainstPattern(patternForEmail, user.getEmail(), EMAIL);

		}
		LOGGER.info(ApplicationConstants.METHOD_EXIT_LABEL);
	}

	@Override
	public boolean supports(final Class<?> clazz) {

		// TODO Auto-generated method stub
		return false;
	}

}
