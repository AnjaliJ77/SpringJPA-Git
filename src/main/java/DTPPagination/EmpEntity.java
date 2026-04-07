package DTO.Pagination;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.jspecify.annotations.NonNull;

import java.sql.Date;

@Entity
@Data
public class EmpEntity {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long empid;

    String ename;

    String dept;

    Date doj;
}
