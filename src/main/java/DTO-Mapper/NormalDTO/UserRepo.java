package Pagination.DTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserInfoEntity, String> {

    UserInfoEntity findByNameAndEmail(String name, String email);
}
