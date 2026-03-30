package ExceptionHandler.Global;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


public class ExceptionClass {
    private String message;
    private HttpStatus httpstatus;

    private LocalDateTime datetime;


    public String getMsg() {
        return message;
    }

    public HttpStatus getHttpstatus() {
        return httpstatus;
    }





    public LocalDateTime getDatetime() {
        return datetime;
    }
    public ExceptionClass(String message, HttpStatus httpstatus, LocalDateTime datetime) {
        this.message = message;
        this.httpstatus = httpstatus;

        this.datetime = datetime;
    }


}
