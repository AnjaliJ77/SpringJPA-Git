package SpringJPA.H2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.jspecify.annotations.NonNull;

@Entity
@Data
public class StudentEntity {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;


   @NotBlank(message = "It should not be empty")
            @Size(min = 3, max = 15,message = "it should have 3letters min")
     String name;


}

