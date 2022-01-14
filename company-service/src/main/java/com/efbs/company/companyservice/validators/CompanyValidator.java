package com.efbs.company.companyservice.validators;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.efbs.company.companyservice.models.Company;
import com.efbs.company.companyservice.utils.ApplicationConstants;
import com.efbs.company.companyservice.utils.ApplicationRegExConstants;




/**
 * The <code>AddCompanyValidator</code> class is responsible for validating company that is added for employee.
 *
 * @author Ashish Kumar Singh
 *
 */
@Component
public class CompanyValidator extends BaseValidator implements Validator {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CompanyValidator.class);

	private static final String COMPANY_NAME = "companyname";
	private static final String COMPANY_WEBSITE = "companywebsite";
	private static final String COMPANY_ADDRESS = "companyaddress";
	private static final String COMPANY_SIZE = "companysize";


	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		LOGGER.info(com.efbs.company.companyservice.utils.ApplicationConstants.METHOD_CALLED_LABEL);

		final Pattern patternForALphabets = Pattern.compile(ApplicationRegExConstants.ALPHABETS_ONLY);
		final Pattern patternForDigit = Pattern.compile(ApplicationRegExConstants.DIGITS_ONLY);


		final Company company = (Company) target;

		// Step 1 Set the errors object in parent
		setErrors(errors);

		// Step 2 Validate Not Empty and Not Null Values
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, COMPANY_NAME, NOTEMPTY);
	

		if (!errors.hasErrors()) {

			validateAgainstPattern(patternForALphabets, company.getCompanyname(), COMPANY_NAME);
//			validateAgainstPattern(patternForALphabets, company.getCompanyaddress(), COMPANY_ADDRESS);
//			validateAgainstPattern(patternForContact, company.getCompanywebsite(), COMPANY_WEBSITE);
			validateAgainstPattern(patternForDigit, String.valueOf(company.getCompanysize()), COMPANY_SIZE);

		}
		LOGGER.info(ApplicationConstants.METHOD_EXIT_LABEL);
	}

}
