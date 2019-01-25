package com.dgile.gh.jwtRest;


import java.util.ArrayList;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BcryptEncoderTest {

	public static void main(String[] args) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		ArrayList<String> encodedArr = new ArrayList<String>();

		for (int i = 1; i < 10; i++) {
			String encoded = encoder.encode("EigQmAh2-56");
			encodedArr.add("\n" + encoded);
		}
		encodedArr.add("\n");
		log.info("\n====> encoded: {}", encodedArr);
	}
}
