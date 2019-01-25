package com.dgile.gh.jwtRest.jwt.resource;

import java.io.Serializable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JwtTokenResponse implements Serializable {

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;

	public JwtTokenResponse(String token) {
		this.token = token;
		log.info("\n====> Token: {}", token);
	}

	public String getToken() {
		return this.token;
	}
}