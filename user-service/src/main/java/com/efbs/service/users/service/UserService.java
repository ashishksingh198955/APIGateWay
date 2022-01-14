package com.efbs.service.users.service;

import java.io.IOException;
import java.util.List;

import com.efbs.service.users.dto.UserDTO;
import com.efbs.service.users.models.AppResponse;
import com.efbs.service.users.models.User;

/**
 * The <code>UserService</code> interface responsible to communicate with database for User module.
 *
 * @author Ashish Kumar Singh
 */
public interface UserService <User, Long> {

	/**
	 * The <code>findByEmail</code> method responsible to fetch record using email.
	 *
	 * @param email
	 * @return
	 */
	User findByEmail(String email);

	/**
	 * The <code>save</code> method responsible to store a record into database.
	 *
	 * @param user
	 * @return
	 */
	User save(User user);

	/**
	 * The <code>registerUser</code> method responsible to create a new user record.
	 *
	 *
	 * @param userDto
	 * @param response
	 * @return
	 * @throws MessagingException
	 * @throws IOException
	 * @throws TemplateException
	 */
	// public AppResponse<Long> registerUser(final UserDto userDto, final AppResponse<Long> response) throws MessagingException, IOException, TemplateException;
//
//	public AppResponse<Long> registerUserByRequestAccess(final RequestForAccessDto reqDto, final AppResponse<Long> response)
//			throws  IOException;

	public boolean isUserActive(String email);




	/**
	 * The <code>registerUser</code> method responsible to create a new user record.
	 *
	 *
	 * @param userDto
	 * @param response
	 * @return
	 * @throws MessagingException
	 * @throws IOException
	 * @throws TemplateException
	 */
	public AppResponse<Long> registerUser(final User userDto, final AppResponse<Long> response) throws  IOException;

	
	/**
	 * @param email
	 * @return true if the user is valid
	 */
	public boolean isValidUser(final String email);

	/**
	 *
	 * @author Ashish Kumar Singh
	 */

	public List<UserDTO> findAllEmployee();
}