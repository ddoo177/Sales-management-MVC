package QLBH_MVC.Repository;

import QLBH_MVC.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Integer>{
    
}
