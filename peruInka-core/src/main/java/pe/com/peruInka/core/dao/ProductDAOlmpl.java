package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusProduct;

public class ProductDAOlmpl extends BaseDAOHibernate implements ProductDAO {

	
	public List<Product> findAllProduct() {
		return find(Product.class, "from product");
	}

	public List<StatusProduct> findStatusProduct() {
		return find(StatusProduct.class, "from StatusProduct");
	}

	public Product findProductById(Long id) {
		return findById(Product.class, id);
	}

	public void deleteProduct(Product product) {
		delete(product);
	}

	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
	       saveProduct(product);	
	}
}


