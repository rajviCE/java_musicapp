package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.javaproject.musicapp.entity.User;


	
	public interface UserService 
	{
		List<User>getaUser();
		Optional<User>/*User*/ getUserById(int Userid);
		 void addUser(User user);
		 void delete(int Userid);
		//User loadUserByUsername(String username);
	}