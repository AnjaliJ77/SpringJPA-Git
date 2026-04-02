package DTO.Mapper;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    UserEntity toEntity(UserRequestDTO user){
        UserEntity requestdto=new UserEntity();
        requestdto.setName(user.getName());
        requestdto.setPwd(user.getPwd());
        requestdto.setEmail(user.getEmail());
        requestdto.setPhn(user.getPhn());
        requestdto.setNotes(user.getNotes());
        return requestdto;

    }

    UserResponseDTO toResponse(UserEntity response){
        UserResponseDTO userentity= new UserResponseDTO();
        userentity.setId(response.getId());
        userentity.setName(response.getName());

        userentity.setEmail(response.email);
        userentity.setPhn(response.phn);
        userentity.setNotes(response.notes);
        return userentity;

    }
}
