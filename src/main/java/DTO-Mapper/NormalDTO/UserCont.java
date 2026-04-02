package Pagination.DTO;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCont {


    @Autowired
    UserService userservice;



    // Request param
    @GetMapping("msg")
    ResponseEntity<String> echoMsg(@RequestParam(name = "message", defaultValue = "hey there")String message){
        return new ResponseEntity<>("Echoed msg: "+message, HttpStatus.CREATED);
    }

    @PostMapping("/createuser")
    ResponseEntity<UserInfoEntity> createuser(@RequestBody UserInfoEntity userinfoentity) {

        UserInfoEntity user1=  userservice.createuser(userinfoentity);
        return ResponseEntity.ok(user1);
    }

    @PostMapping("/userlogin")

    UserLogin loginuser(@RequestBody UserInfoEntity userInfoEntity){

        UserLogin userlog=userservice.loginuser(userInfoEntity);
        System.out.println(userlog);
        return userlog;

    }

}
