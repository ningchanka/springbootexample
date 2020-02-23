package restful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import restful.model.Product;

public interface ProductRepository extends MongoRepository <Product, Long > {

}