package ExceptionHandler.Global;

// When something goes wrong in your application (like data not found, invalid input, etc.), an exception occurs.
//
//👉 Instead of showing ugly error messages, we handle them and send a clean, meaningful response to the user.


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class MyGlobalExceptionhandler {


    @ExceptionHandler(ProIdNotFound.class)
    ResponseEntity<?> globalException(ProIdNotFound productnotfound){
        ExceptionClass exceptionclass=new ExceptionClass
                (productnotfound.getMessage(),
                        HttpStatus.NOT_FOUND,
                        LocalDateTime.now());
        return new ResponseEntity<>(exceptionclass, HttpStatus.NOT_FOUND);
    }

}
