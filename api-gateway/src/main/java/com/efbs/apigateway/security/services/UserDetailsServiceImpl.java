package com.efbs.apigateway.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.efbs.apigateway.dto.UserDTO;
import com.efbs.apigateway.models.Role;
import com.efbs.apigateway.repository.RoleRepository;
import com.efbs.apigateway.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	com.efbs.apigateway.repository.UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserDTO user = userRepository.findByEmailIsNull(email)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + email));

		System.err.println(user);

		List<Role> role=roleRepository.getRoleIdAndRoleName(user.getUserid());
//		System.err.println("roles"+role.toString());
		user.setRoles(role);
//		System.err.println("roles===="+user.toString());
		return UserDetailsImpl.build(user);
	}

}
