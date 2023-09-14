package mypackage.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mypackage.entities.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,String>{
	
}
