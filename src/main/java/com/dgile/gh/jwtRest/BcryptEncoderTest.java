package com.dgile.gh.jwtRest;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BcryptEncoderTest {

	public static void main(String[] args) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		for (int i = 1; i < 10; i++) {
			String encoded = encoder.encode("EigQmAh2-56");
			log.info("\n====>encoded: {}", encoded);
		}
	}
}
