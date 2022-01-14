package com.efbs.service.users.jwtutils;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtUtils {
//	private static final Logge logger = LoggerFactory.getLogger(JwtUtils.class);

	@Value("${efbs.service.users.app.jwtSecret}")
	private String jwtSecret;

	public String getUserEmailFromJwtToken(String token) {
		return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
	}
	
	
	
//	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
//	    final Claims claims = getAllClaimsFromToken(token);
//	    return claimsResolver.apply(claims.getId());
//	}

	public Claims getAllClaimsFromToken(String token) {
	    return Jwts.parser()
	            .setSigningKey(jwtSecret)
	            .parseClaimsJws(token)
	            .getBody();
	}


}
