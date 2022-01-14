package com.efbs.apigateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.efbs.apigateway.security.jwt.AuthEntryPointJwt;
import com.efbs.apigateway.security.jwt.AuthTokenFilter;
import com.efbs.apigateway.security.services.UserDetailsServiceImpl;

import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(
//	
////		 securedEnabled = true,
////		 jsr250Enabled = true,
//		prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserDetailsServiceImpl userDetailsService;

	@Autowired
	private AuthEntryPointJwt unauthorizedHandler;

	@Bean
	public AuthTokenFilter authenticationJwtTokenFilter() {
		return new AuthTokenFilter();
	}

	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.authorizeRequests().antMatchers("/api/auth/**").permitAll()
			.antMatchers(HttpMethod.OPTIONS, "/**")
			.permitAll()
			.antMatchers("/company/api/addcompany/**").hasRole("SYSTEM_ADMIN")
			.antMatchers("/company/api/getlistofcompanybysystemadmin/**").hasRole("SYSTEM_ADMIN")
			.antMatchers("/api/logout/**").permitAll()
			.antMatchers("/employee/api/addemployee/**").hasAnyRole("COMPANY_ADMIN","COMPANY_HR","SYSTEM_ADMIN")
			.anyRequest().authenticated();
		http.addFilterAfter(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
//	http.csrf().disable().authorizeRequests()
//	.antMatchers("/api/auth/**")
//	.permitAll()
//	.antMatchers("/company/api/addcompany/**").hasRole("SYSTEM_ADMIN")
//	.antMatchers("/company/api/getlistofcompanybysystemadmin/**").hasRole("SYSTEM_ADMIN")
//	.antMatchers("/api/logout/**").permitAll()
//	.antMatchers("/employee/api/addemployee/**").hasAnyRole("COMPANY_ADMIN","COMPANY_HR","SYSTEM_ADMIN")
//	.anyRequest().authenticated().and().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and().sessionManagement()
//	.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//	http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//	}
	
//	
//	@Lazy
//	public WebMvcConfigurer configurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				// TODO Auto-generated method stub
//				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*");
//			}
//		};
//		
//	}
	
		
}
