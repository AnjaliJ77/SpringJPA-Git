package ExceptionHandler;

import ExceptionHandler.Global.ProIdNotFound;
import SpringJPA.H2.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProController {


    @Autowired
    ProService proservice;

    @PostMapping("/add")
    ResponseEntity<ProductEntity> createUser(@RequestBody ProductEntity proentity){
        ProductEntity  create = proservice.createUser(proentity);
        //return new ResponseEntity<>(create, HttpStatus.CREATED);
        return ResponseEntity.ok(create);
    }
    @GetMapping("/getAll")
    ResponseEntity<List<ProductEntity>> getAll(){
        List<ProductEntity> gettu= proservice.getAll();
        return ResponseEntity.ok(gettu);
    }
    @GetMapping("/getbyid/{id}")
    ResponseEntity<ProductEntity> getById(@PathVariable Long id){

        //return proservice.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
ProductEntity proen=proservice.getById(id);
return ResponseEntity.ok(proen);

    }

    @DeleteMapping("/delete")
    ResponseEntity<String> deleteAll(){
        proservice.deleteAll();
        //return new ResponseEntity<>("Deleted"delete,HttpStatus.GONE);
        return new ResponseEntity<>("deleted", HttpStatus.GONE);
    }

    @DeleteMapping("/delete/{id}")
    String deletebyid(@PathVariable Long id ){
        proservice.deletebyid(id);

            return "deleted sucessfully";
        }


    @PutMapping("/update/{id}")
    ResponseEntity<ProductEntity> updateUser(@RequestBody ProductEntity proentity, @PathVariable Long id){
       ProductEntity update=proservice.updateUser(proentity,id);
        return ResponseEntity.ok(update);

    }


}
