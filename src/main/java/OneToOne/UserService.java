package OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;
	
	public UserDetail createUser(UserDetail userdetail) {
		return userrepo.save(userdetail);
		
		
	}

	public List<UserDetail> getAll() {
		return userrepo.findAll();
		// TODO Auto-generated method stub
		
	}

}
