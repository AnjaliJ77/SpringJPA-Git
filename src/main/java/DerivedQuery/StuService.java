package DerivedQuery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuService {
	@Autowired
	StuRepo sturepo;

	public Student save(Student stu) {
		return sturepo.save(stu);
		
		
	}

		public List<Student> getAll() {
		// TODO Auto-generated method stub
		return sturepo.findAll();
	}

		public Student getById(Long id) {
			return sturepo.getById(id);
		}

		

		public void deleteById(Long id) {
			sturepo.deleteById(id);
			
		}
		
		List<Student> getByname(String sname) {
			return sturepo.findBySname(sname);
			
		}

}
