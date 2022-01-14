//
//package com.efbs.service.users.utils;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.efbs.service.users.repository.CompanyRepository;
//import com.efbs.service.users.repository.RoleRepository;
//import com.efbs.service.users.repository.UserRepository;
//import com.efbs.service.users.repository.UserRolesRepository;
//
//
///**
// * The <code>RepositoryFactory</code> class responsible for @Autowired all the repositories used in application.
// *
// * @author Ashish Kumar Singh
// */
//@Component
//public class RepositoryFactory {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Autowired
//	private UserRolesRepository userRolesRepository;
//
//	@Autowired
//	private RoleRepository roleRepository;
//
//	@Autowired
//	private CompanyRepository companyRepository;
//
//	public UserRepository getUserRepository() {
//		return userRepository;
//	}
//
//	public UserRolesRepository getUserRolesRepository() {
//		return userRolesRepository;
//	}
//
//	public RoleRepository getRoleRepository() {
//		return roleRepository;
//	}
//
//	public CompanyRepository getCompanyRepository() {
//		return companyRepository;
//	}
//
//
//}
//
//
//
//
