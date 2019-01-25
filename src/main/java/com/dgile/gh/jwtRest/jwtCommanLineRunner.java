package com.dgile.gh.jwtRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class jwtCommanLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		String str = getClass().toString();
		str=str.substring(str.lastIndexOf(".") + 1);		
		log.info("\n====> Class: {}", str);

	}

}
