package com.javaproject.musicapp.Controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.musicapp.Service.UserService;
import com.javaproject.musicapp.Service.UserServiceImp;

import com.javaproject.musicapp.entity.User;


@RestController
@RequestMapping("/api/User")
public class Usercontroller 
{
	@Autowired
	private UserServiceImp Userservice;
	
	@GetMapping
	public List<User>getaUser()
	{
		return Userservice.getaUser();
	}
	
	@GetMapping("/{id}")
		public User getUserById(@PathVariable int id)
	{
		return Userservice. getUserById(id)
				.orElseThrow(()->new 
				NoSuchElementException("Candidate not found with "
				+ "id"+id));
	}
	
	@PostMapping
	public User addUser(@RequestBody User user)
	 {
		Userservice.addUser(user);
		
		return user;
	 }
	
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id,
			@RequestBody User updatedUser )
	{
		User use=Userservice. getUserById(id)
				.orElseThrow(()->new 
				NoSuchElementException("Candidate not found with "
				+ "id"+id));
		
		use.setAge(updatedUser.getAge());
		use.setPassword(updatedUser.getPassword());
		use.setU_role(updatedUser.getU_role());
		use.setR_playedmusic_name(updatedUser.getR_playedmusic_name());
		use.setEmail(updatedUser.getEmail());
		use.setGender(updatedUser.getGender());
		use.setUsername(updatedUser.getUsername());
		Userservice.addUser(use);
		
		return use;
		
	}
	
	
	@DeleteMapping("/{id}")
	public  void delete(@PathVariable int id)
	{
		Userservice.delete(id);
	}


}

