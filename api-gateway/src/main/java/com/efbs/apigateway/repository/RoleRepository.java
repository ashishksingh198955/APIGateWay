package com.efbs.apigateway.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.efbs.apigateway.models.Role;

import feign.Param;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByRolename(Role rolename);
	
	@Query(value = "select u.roleid,r.rolename  from users_roles as u left join roles as r on u.roleid = r.roleid \n"
			+ "where u.userid =:userid and u.isActive = 1", nativeQuery = true)
	public List<Role> getRoleIdAndRoleName(@Param("userid") long userid);
	
	
}
