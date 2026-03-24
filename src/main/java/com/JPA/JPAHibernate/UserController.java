package com.JPA.JPAHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/createuser")
	public UserEntity createUser(@RequestBody UserEntity user) {
		return userservice.saveUser(user);
		
		
	}
	@GetMapping("/getAll")
	List<UserEntity> getAll() {
		return userservice.getAll();
	}
	
	
	@GetMapping("/getuser/{id}")
	UserEntity getUserById(@PathVariable Long id) {
		userservice.getUserById(id);
		System.out.println("2ndddddd level cache");
		userservice.getUserById(id);
		System.out.println("2bnd level cache");
		return userservice.getUserById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteAll(@PathVariable Long id ) {
		 userservice.deleteAll(id);
		 return "Deleted successfully";
	}
	

}
