
package com.efbs.service.users.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.efbs.service.users.dto.UserDTO;
import com.efbs.service.users.models.AppResponse;
import com.efbs.service.users.models.Role;
import com.efbs.service.users.models.User;
import com.efbs.service.users.repository.RoleRepository;
import com.efbs.service.users.repository.UserRepository;
import com.efbs.service.users.service.UserService;
import com.efbs.service.users.utils.ApplicationConstants;



/**
 * The <code>UserServiceImpl</code> holds implementation of User service.
 *
 * @author Ashish Kumar Singh
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepo;

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





	@Override
	public List<UserDTO> findAllEmployee() {
		LOGGER.info(ApplicationConstants.METHOD_ENTER_LABEL);
		//
		
				List<UserDTO> list= userRepository.findAllEmployee();
				System.err.println(list.toString());
				return list;
	}

}
