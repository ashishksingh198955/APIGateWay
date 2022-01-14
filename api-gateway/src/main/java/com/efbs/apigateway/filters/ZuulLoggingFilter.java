package com.efbs.apigateway.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private static final Logger lOGGER = LoggerFactory.getLogger(ZuulLoggingFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		HttpServletRequest httpServletRequest = RequestContext.getCurrentContext().getRequest();
		System.err.println("Zull API GateWay is calling");
		System.out.println("Get Header"+httpServletRequest.getHeader("Authorization"));
		
		lOGGER.info("request -> {} request uri -> {}", httpServletRequest, httpServletRequest.getRequestURI());
		return null;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
