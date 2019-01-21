package com.dgile.gh.jwtRest.shared;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Helpers {

	public static int getRandomNumberNoDecimals(int min, int max, int size) {
		return (int) Math.floor(min + Math.random() * (max - min) * size);
	}

	public static double getRandomNumber() {
		double min = 10000.00;
		double max = 25000.00;
		return Math.floor((min + Math.random() * (max - min)) * 100) / 100;
	}

	public static String Obj2Json(Object obj, Boolean pretty) {
		String jsonString = null;
		ObjectMapper mapper = new ObjectMapper();
		// Object to JSON in String
		try {
			if (pretty)// pretty
				jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			else
				// oneLiner
				jsonString = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return jsonString;
	}

	public static String getRandomDate(int start, int end) {
		GregorianCalendar gc = new GregorianCalendar();
		int year = randBetween(start, end);
		gc.set(Calendar.YEAR, year);
		int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
		return String.format("%02d.%02d.%d", gc.get(Calendar.DAY_OF_MONTH), (gc.get(Calendar.MONTH) + 1),
				gc.get(Calendar.YEAR));

	}

	private static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

}
