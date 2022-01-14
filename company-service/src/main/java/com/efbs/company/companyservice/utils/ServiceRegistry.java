
package com.efbs.company.companyservice.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.efbs.company.companyservice.service.CompanyService;



/**
 * The <code>ServiceRegistry</code> class responsible for @Autowired all the Service interfaces.
 *
 * @author Ashish Kumar Singh
 */
@Component
public class ServiceRegistry {




	@Autowired
	private CompanyService companyService;


//	@Autowired
//	private CommonServic commonService;
////	
//	public UserService getUserService() {
//		return userService;
//	}

	public CompanyService getCompanyService() {
		return companyService;
	}

	

}
