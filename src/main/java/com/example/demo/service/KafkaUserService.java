package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.KafkaUserRepository;



@Service
public class KafkaUserService {
	@Autowired
	private KafkaUserRepository edao;

	public void saveUser(User user) {
		edao.save(user);
	}

	public Iterable<User> findAllUsers() {
	return edao.findAll();
	}

	
	
}
