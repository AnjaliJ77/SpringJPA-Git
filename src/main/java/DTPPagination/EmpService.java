package DTO.Pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    Repo repo;


    public Page<EmpEntity> getAll(Pageable pageable, String search) {
   if(search==null){
       return repo.findAll(pageable);   // Content it converts List to pages
   }
   else {
       return repo.findByEname(search, pageable);
   }
    }
}
