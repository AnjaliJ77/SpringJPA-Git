package OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserDetail, Long> {
	
	List<UserDetail> findByUname(String uname);

}
