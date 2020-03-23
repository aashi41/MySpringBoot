package com.example.demo.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@RestController
public class userController {
	
	@Autowired
	UserDao rep;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		return rep.findAll();
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User userObj) {
		rep.save(userObj);
		return "User saved successfully";
	}
	
	@GetMapping("/getUser/{username}")
	public List<User> getAllUser(@PathVariable String username) {
		return rep.findByUsername(username);
	}
	
	

}
