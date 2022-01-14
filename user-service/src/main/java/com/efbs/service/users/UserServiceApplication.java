package com.efbs.service.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication{
	
//	@Autowired
//     JwtUtils jwtUtils;
//	
//	@RequestMapping(value = "/admin")
//	
//	public String echoStudentName(Principal principal) {
//		
//		 
//		return "Hello  Admin!" ;
//	}
//
//	@GetMapping("/user")
//	public String userInfo(HttpServletRequest authentication) {
//         
//		
//	    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//	    
//	    String token = request.getHeader("Authorization").split(" ")[1];
//		String email=jwtUtils.getUserEmailFromJwtToken(token);
//		
//	    final Claims claims = jwtUtils.getAllClaimsFromToken(token);
//
////		long companyId=jwtUtils.getClaimFromToken(token, null);
//		System.out.println("Get Token In User-Service "+token);
//		System.err.println("Get Email In User-Service "+email);
//		System.err.println("Get UserId In User-Service "+claims.get("User Id"));
//		System.err.println("Get CompanyId In User-Service "+claims.get("CompanyId"));
//
//
////		String role = authentication.getAuthorities().stream()
////				.findAny().get().getAuthority();
//
//		return "Your users name is: "  + " and your role is: " ;
//	}
//	@RequestMapping(value = "/guest")
//	public String getStudentDetail() {
//		
////		long id=getUserPrinciple().getUserprofileinfoid();
////		String email=getUserPrinciple().getEmail();
//		return "Hello Guest!";
//	}
//	
	

	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}



