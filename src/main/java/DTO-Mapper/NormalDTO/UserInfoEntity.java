package Pagination.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
public class UserInfoEntity  {


            @NotEmpty
    String name;
    @Id
            @Email


    String email;

    String password;

    long phn;
    int age;
    String address;


    public UserInfoEntity() {

    }
}
