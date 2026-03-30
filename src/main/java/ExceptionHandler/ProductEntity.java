package ExceptionHandler;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

public class ProductEntity {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    Long id;


    @NotEmpty(message = "Name should not be empty")

            @Getter
            @Setter
            @Size(min = 3,max = 10,message = "name must contain more than 3 letters")
    String name;

    @Getter
    @Setter
    String address;

    public ProductEntity() {
    }
}
