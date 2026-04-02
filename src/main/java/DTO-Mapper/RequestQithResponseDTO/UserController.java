package DTO.Mapper;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/create")
    ResponseEntity<UserResponseDTO> createResponse(@Valid @RequestBody UserRequestDTO userrequest){
        UserResponseDTO userval=userservice.createResponse(userrequest);
        return new ResponseEntity<>(userval, HttpStatus.CREATED);

    }
}
