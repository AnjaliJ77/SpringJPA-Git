package Pagination.DTO;

import org.springframework.stereotype.Component;

@Component
public class Usermapper {


    UserInfoEntity toEntity(UserLogin userlogin){
        UserInfoEntity userentity= new UserInfoEntity();
        userentity.setName(userlogin.getName());
        userentity.setEmail(userlogin.getEmail());
        return  userentity;
    }
    UserLogin toLoginuser(UserInfoEntity userinfo){
        UserLogin userlogin=new UserLogin();
        userlogin.setName(userinfo.getName());
        userlogin.setEmail(userinfo.getEmail());
        return userlogin;
    }
}
