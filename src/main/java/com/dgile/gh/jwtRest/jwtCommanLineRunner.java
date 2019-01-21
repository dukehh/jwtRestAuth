package com.dgile.gh.jwtRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class jwtCommanLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		String str = "ABC";
		log.info("\n====> str: {}", str);

	}

}
