package com.efbs.company.companyservice.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efbs.company.companyservice.dto.CompanyDTO;
import com.efbs.company.companyservice.models.AppResponse;
import com.efbs.company.companyservice.models.Company;
import com.efbs.company.companyservice.repository.CompanyRepository;
import com.efbs.company.companyservice.utils.ApplicationConstants;
import com.efbs.company.companyservice.utils.ApplicationURIConstants;
import com.efbs.company.companyservice.validators.CompanyValidator;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(ApplicationURIConstants.BASE_API)
public class CompanyController extends BaseController {

	private final Logger LOGGER = LoggerFactory.getLogger(CompanyController.class);

	@Autowired
	public CompanyValidator companyValidator;

	@Autowired
	CompanyRepository companyRepository;

	@PostMapping(ApplicationURIConstants.REGISTER_COMPANY_BY_SYSTEM_ADMIN)
	public AppResponse<Long> registerCompany(@Valid @RequestBody Company companyInfo,final BindingResult bindingResult) {


		final AppResponse<Long> response = new AppResponse<>();
		LOGGER.info(ApplicationConstants.METHOD_CALLED_LABEL);
		final Set<String> errorSet = new HashSet<>();
		try {

			companyValidator.validate(companyInfo, bindingResult);
			if (bindingResult.hasErrors()) {
				bindingResult.getFieldErrors().forEach(er -> {
					errorSet.add(getMessage(er.getCodes()[0]));
				});
				response.setErrors(errorSet);
				response.setStatus(HttpStatus.BAD_REQUEST.value());
				return response;
			}

			Company company=companyRepository.save(companyInfo);
			if (company.getCompanyid() !=null)
			{
				response.setStatus(HttpStatus.OK.value());
				response.setMessage(ApplicationConstants.COMPANY_ADD_SUCCESS);
			}

		}
		catch (final Exception exception) {
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			response.setMessage(ApplicationConstants.ERROR_LABEL);
			response.addError("Please verify the request format. It contains invalid value for one of the field.");
			LOGGER.info(ApplicationConstants.METHOD_EXCEPTION_LABEL + exception);
		}
		LOGGER.info(ApplicationConstants.METHOD_EXIT_LABEL);
		return response;
	}

	@GetMapping(value = ApplicationURIConstants.LIST_OF_COMPANY)
	@ResponseBody
	public AppResponse<Object> getCompanyList() {
		LOGGER.info(ApplicationConstants.METHOD_ENTER_LABEL);
		final AppResponse<Object> response = new AppResponse<>();
		try {

			final List<CompanyDTO> riList = getServiceRegistry().getCompanyService().findAllCompany();

			System.out.println(riList.toString());

			//			if (riList !=null) {
			//				response.setMessage(getMessage("record.found.suceess"));
			//			} else {
			//				response.setMessage(getMessage("record.not.found"));
			//			}
			response.setData(riList);
			response.setStatus(HttpStatus.OK.value());

		} catch (final Exception exception) {
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			response.setMessage(ApplicationConstants.ERROR_LABEL);
			LOGGER.info(ApplicationConstants.METHOD_EXCEPTION_LABEL + exception);
		}
		LOGGER.info(ApplicationConstants.METHOD_EXIT_LABEL);
		return response;
	}
}



