package DTO.Mapper;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserReposit userrepo;

    @Autowired
    UserMapper usermapper;

    public UserResponseDTO createResponse(@Valid UserRequestDTO userrequest) {
        UserEntity entity = usermapper.toEntity(userrequest);
        UserEntity saved = userrepo.save(entity);
        return usermapper.toResponse(saved);


    }
}
