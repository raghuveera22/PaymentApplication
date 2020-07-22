package com.payments.service;

import com.payments.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

	static Long counter = 1L;
	Map<Long, User> userMap = new LinkedHashMap<>();

	public List<User> getUsers() {
		List<User> list = userMap.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
		return list;
	}

	public User getUser(long id) {
		return userMap.get(id);
	}

	public User addUser(User user) {
		user.setId(counter);
		userMap.put(counter, user);
		counter++;
		return user;
	}

	public User updateUser(User user) {
		userMap.put(user.getId(), user);
		return user;
	}
}
