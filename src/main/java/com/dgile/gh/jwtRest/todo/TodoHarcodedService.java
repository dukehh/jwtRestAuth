package com.dgile.gh.jwtRest.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dgile.gh.jwtRest.shared.*;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class TodoHarcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "dukehh", "Learn Java", new Date(), false));
		todos.add(new Todo(++idCounter, "dukehh", "Learn Angualr", new Date(), false));
		todos.add(new Todo(++idCounter, "dukehh", "Learn Python", new Date(), false));
		todos.add(new Todo(++idCounter, "dukehh", "Learn Javascript", new Date(), false));
		todos.add(new Todo(++idCounter, "dukehh", "Learn C++", new Date(), false));
	}

	public List<Todo> findAll() {

		log.info("\n====>Todo: {}", Helpers.Obj2Json(todos, true));
		return todos;

	}

	public Todo saveTodo(Todo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
			log.info("\n====>new Todo saved: {}", todo.getId());
		} else {
			deleteById(todo.getId());
			todos.add(todo);
			log.info("\n====>Todo updated: {}", todo.getId());

		}
		
		return todo;
	}

	public Todo deleteById(long id) {

		Todo todo = findById(id);

		log.info("\n====>Todo: {}", Helpers.Obj2Json(todo, false));
		if (todo == null)
			return null;

		if (todos.remove(todo))
			return todo;
		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
