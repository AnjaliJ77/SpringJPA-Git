package OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/post")
	public ResponseEntity<UserDetail> createUser(@RequestBody UserDetail userdetail) {
		userservice.createUser(userdetail);
		return new ResponseEntity<>(userdetail);
		
		
	}
	
	
	@GetMapping("/get")
	List<UserDetail> getAll(){
		return userservice.getAll();
		
	}


}
