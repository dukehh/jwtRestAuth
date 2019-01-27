package com.dgile.gh.jwtRest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dgile.gh.jwtRest.todo.Todo;
import com.dgile.gh.jwtRest.todo.TodoJpaRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class jwtCommanLineRunner implements CommandLineRunner {

	@Autowired
	private TodoJpaRepository todoJparepository;

	@Override
	public void run(String... args) throws Exception {

		String str = getClass().toString();
		str = str.substring(str.lastIndexOf(".") + 1);
		log.info("\n====> Class: {}", str);

		Stream.of(new Todo("duke", "Learn Guitar", new Date(), false),
				new Todo("duke", "Learn Programming", new Date(), false), new Todo("duke", "Learn a Craft", new Date(), false),
				new Todo("duke", "Learn to love", new Date(), false), new Todo("dukehh", "Learn Guitar-hh", new Date(), false),
				new Todo("dukehh", "Learn Programming-hh", new Date(), false),
				new Todo("dukehh", "Learn a Craft-hh", new Date(), false),
				new Todo("dukehh", "Learn to love-hh", new Date(), false))
		.forEach(todoJparepository::save);

		List<Todo> todos = new ArrayList<>();
		todos.add(new Todo("duke","Learn Guitar2",new Date(),false));
		todos.add(new Todo("duke","Learn Programming2",new Date(),false));
		todos.add(new Todo("duke","Learn a Craft2",new Date(),false));
		todos.add(new Todo("duke","Learn to love2",new Date(),false));
		todos.add(new Todo("dukehh","Learn Guitar-hh2",new Date(),false));
		todos.add(new Todo("dukehh","Learn Programming-hh2",new Date(),false));
		todos.add(new Todo("dukehh","Learn a Craft-hh2",new Date(),false));
		todos.add(new Todo("dukehh","Learn to love-hh2",new Date(),false));
		int size = todoJparepository.saveAll(todos).size();
		log.info("\n====> size: {}", size);

	}
}
