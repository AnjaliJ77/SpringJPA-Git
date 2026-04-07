package DTO.Pagination;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<EmpEntity,Long> {
    Page<EmpEntity> findByEname(String ename, Pageable pageable );
}
