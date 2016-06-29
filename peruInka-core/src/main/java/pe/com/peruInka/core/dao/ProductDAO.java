package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusProduct;


public interface ProductDAO {

	
	List<Product> findAllProduct();
	List<StatusProduct> findStatusProduct();
	Product findProductById(Long id);
	void deleteProduct(Product product);
	void saveProduct(Product product);
}
