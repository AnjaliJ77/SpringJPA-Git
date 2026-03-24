package DerivedQuery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StuCon {
	@Autowired
	StuService stuservice;
	
	@PostMapping("/add")
	private Student postUser(@RequestBody Student stu) {
		return stuservice.save(stu);
		
	}
	
	@GetMapping("/getAll")
	List<Student> getAll(){
		return stuservice.getAll();
		
	}
	
	@GetMapping("getById/{id}")
	Student getById(@PathVariable Long id) {
		return stuservice.getById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	String deleteById(@PathVariable Long id) {
		stuservice.deleteById(id);
		return "deleted successfully";
	}
	
	@GetMapping("/bysname/{sname}")
		List<Student> findByname(String sname){
			return stuservice.getByname(sname);
		}
		
	}
