package com.efbs.service.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efbs.service.users.dto.UserDTO;
import com.efbs.service.users.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select new com.efbs.service.users.dto.UserDTO(user.userid, CONCAT(user.firstname , ' ' , user.middlename , ' ' , user.lastname)  as username,user.companyid,user.password,user.email) from User as user where user.email=:email")
	Optional<UserDTO> findByEmailIsNull(String email);

	//	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	
	@Query(value = "select count(*) from users where email =:email and status=1",nativeQuery = true)
	public int isUserActive(@Param("email") String email);
	
	
	@Query("select new com.efbs.service.users.dto.UserDTO(user.userid, CONCAT(user.firstname , ' ' , user.middlename , ' ' , user.lastname)  as username,user.companyid,user.password,user.email) from User as user ")
	List<UserDTO> findAllEmployee();
//	@Query(value = "select r.rolename as role,u.userid, u.firstname,u.lastname,u.email,u.companyid,u.gender,u.contact,u.division,u.position from users as u inner join userroles as ur on u.userid=ur.userid inner join rolemaster as r\n" + 
//			"on ur.roleid=r.roleid",nativeQuery =true )
//	List<User> findAllEmployee();
}
