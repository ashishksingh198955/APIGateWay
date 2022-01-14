package com.efbs.apigateway.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();

    System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

    return null;
  }
  
  
  
  
  
//  private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {​​​​​​​
//      String token = request.getHeader(HEADER_STRING);
//      if (token != null) {​​​​​​​
//          // parse the token.
//          String user;
//          try {​​​​​​​
//              user = Jwts.parser()
//                      .setSigningKey(SECRET.getBytes())
//                      .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
//                      .getBody()
//                      .getSubject();
//          }​​​​​​​ catch (SignatureException e) {​​​​​​​
//              return null;
//          }​​​​​​​
  
  
  
  

}