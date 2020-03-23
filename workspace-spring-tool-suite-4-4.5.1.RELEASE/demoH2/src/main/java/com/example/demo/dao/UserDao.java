package com.example.demo.dao;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

	List<User> findByUsername(String username);
	

}
