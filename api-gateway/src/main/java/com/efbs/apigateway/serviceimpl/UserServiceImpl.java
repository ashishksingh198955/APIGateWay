
package com.efbs.apigateway.serviceimpl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.efbs.apigateway.models.AppResponse;
import com.efbs.apigateway.models.User;
import com.efbs.apigateway.service.UserService;



/**
 * The <code>UserServiceImpl</code> holds implementation of User service.
 *
 * @author Ashish Kumar Singh
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean isUserActive(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean isValidUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object save(Object user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse registerUser(Object userDto, AppResponse response) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
