package com.efbs.apigateway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efbs.apigateway.dto.UserDTO;
import com.efbs.apigateway.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select new com.efbs.apigateway.dto.UserDTO(user.userid, CONCAT(user.firstname , ' ' , user.middlename , ' ' , user.lastname)  as username,user.companyid,user.password,user.email) from User as user where user.email=:email")
	Optional<UserDTO> findByEmailIsNull(String email);

	//	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	
	@Query(value = "select count(*) from users where email =:email and status=1",nativeQuery = true)
	public int isUserActive(@Param("email") String email);
}
