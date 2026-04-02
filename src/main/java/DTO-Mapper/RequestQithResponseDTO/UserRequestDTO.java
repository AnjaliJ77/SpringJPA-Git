package DTO.Mapper;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor

public class UserRequestDTO {

    @NotBlank(message = "name field must not be blank")
    String name;

    @Email(message = " pls enter valid E-mail id")
    String email;

    @NotEmpty(message = "pwd must not be empty")
    String pwd;
    long phn;
    String notes;
}
