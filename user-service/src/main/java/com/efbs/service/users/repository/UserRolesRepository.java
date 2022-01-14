package com.efbs.service.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efbs.service.users.models.UserRole;

public interface UserRolesRepository extends JpaRepository<UserRole, Long> {

	
}
