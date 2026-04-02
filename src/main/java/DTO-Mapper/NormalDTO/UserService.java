package Pagination.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepo userrepo;

    @Autowired
    Usermapper usermap;

 public UserInfoEntity createuser(UserInfoEntity userinfoentity) {
         return userrepo.save(userinfoentity);
   }



    public UserLogin loginuser(UserInfoEntity userInfoEntity) {
        UserInfoEntity userlog = userrepo.findByNameAndEmail(
                userInfoEntity.getName(), userInfoEntity.getEmail()
        );
        if (userlog == null) {
            return null; // or throw exception
        }

        // Convert Entity → DTO
        UserLogin response = new UserLogin();
        response.setEmail(userlog.getEmail());
        response.setName(userlog.getName());



        return response;
    }



    }

