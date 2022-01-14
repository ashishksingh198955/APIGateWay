
package com.efbs.service.users.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.efbs.service.users.service.UserService;


/**
 * The <code>ServiceRegistry</code> class responsible for @Autowired all the Service interfaces.
 *
 * @author Ashish Kumar Singh
 */
@Component
public class ServiceRegistry {


	@Autowired
	private UserService userService;




//	@Autowired
//	private CommonServic commonService;
//	
	public UserService getUserService() {
		return userService;
	}

	

}
