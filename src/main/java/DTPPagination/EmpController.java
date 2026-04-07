package DTO.Pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empservice;


    //pageNo, Pagesize means those many numbers of entry we get
    @GetMapping("/getAll")
    PageResponseDTO<EmpEntity> getAll(@RequestParam(defaultValue = "0") int pageNo,
                           @RequestParam(defaultValue = "7") int pageSize,
                           @RequestParam(defaultValue = "ename") String sortBy,
                           @RequestParam(defaultValue = "ASC") String sortDirection,
                           @RequestParam(required=false)String search, Pageable pageable){

        Sort sort=null;
        if (sortDirection.equalsIgnoreCase("ASC")) {

            sort=Sort.by(sortBy).ascending();
        }
        else sort= Sort.by(sortBy).descending();


        pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<EmpEntity>page= (Page<EmpEntity>) empservice.getAll(pageable,search);
        PageResponseDTO<EmpEntity> response= new PageResponseDTO<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalPages(),
                page.getTotalElements(),
                page.isLast()
        );
            return ResponseEntity.ok(response).getBody();

        //return empservice.getAll( PageRequest.of(pageNo,pageSize, sort),search);    // we can set default value //it's not mandatoty

    }
}
