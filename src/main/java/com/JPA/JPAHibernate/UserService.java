package com.JPA.JPAHibernate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;


	public UserEntity saveUser(UserEntity user) {
		return userrepo.save(user);
	}


	public UserEntity getUserById(Long id) {
		Optional<UserEntity> userby = userrepo.findById(id);
		if(userby.isPresent()) {
			
		}
		else
			return null;
		return null;
		
	}


	public List<UserEntity> getAll() {
		return userrepo.findAll();
		// TODO Auto-generated method stub
		
	}


	public void deleteAll(Long id) {
		userrepo.deleteById(id);
		
	}


	

	
}
