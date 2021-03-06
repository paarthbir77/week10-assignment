package com.example.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.user.clients.AdminClient;
import com.example.user.entity.User;
import com.example.user.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService{
//	@Autowired
//	UserRepository userRepository;
	@Autowired
	AdminClient adminClient;
	
//	@Transactional
//	public User saveUser(User user) {
//		User userResponse = userRepository.save(user);
//		return userResponse;
//	}
	
	@Override
	public String createUser(String email, String password) {
		//User user = new User(email, "Customer", password);
//		user = saveUser(user);
//		return user.toString();
		return adminClient.saveUser(email, "Customer", password);
	}

}
