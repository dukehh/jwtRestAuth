package com.dgile.gh.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgile.gh.jwtRest.shared.Helpers;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController { 

	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean(String.format("You are authenticated! %s", Helpers.getRandomDate(2018,2019)));
	}

}
