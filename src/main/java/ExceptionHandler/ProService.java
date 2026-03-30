package ExceptionHandler;

import ExceptionHandler.Global.ProIdNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProService {


    @Autowired
    ProRepo prorepo;

    public ProductEntity createUser(ProductEntity proentity) {
        return prorepo.save(proentity);
    }




    public List<ProductEntity> getAll() {
        return prorepo.findAll();
    }

    public ProductEntity getById(Long id) {
        return prorepo.findById(id).orElseThrow(()-> new ProIdNotFound(id+" Product id not found"));

    }

    public void deleteAll() {
        prorepo.deleteAll();
    }

    public void deletebyid(Long id) {
        if(prorepo.existsById(id)){
            prorepo.deleteById(id);

        }
        else {
            throw new ProIdNotFound("The product id: "+id+ " Not founddd");
        }

        //return null;
    }

    public ProductEntity updateUser(ProductEntity proentity, Long id) {
        ProductEntity upd=prorepo.findById(id).orElseThrow(()->new ProIdNotFound(id+" not found"));
        upd.setName(proentity.getName());
        upd.setAddress(proentity.getAddress());
        return prorepo.save(proentity);

    }
}
