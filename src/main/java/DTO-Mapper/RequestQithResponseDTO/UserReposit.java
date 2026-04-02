package DTO.Mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposit extends JpaRepository<UserEntity, Long> {
}
