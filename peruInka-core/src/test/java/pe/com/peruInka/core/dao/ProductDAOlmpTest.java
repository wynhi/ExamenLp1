package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Product;

public class ProductDAOlmpTest  extends AbstractUnitTest{

	
	
	@Autowired
	protected ProductDAO productDAO;
	

	public void testFindAllProduct() {
		System.out.println("===" + productDAO.findAllProduct());
	}



	public void testSaveProduct() {
		testFindAllProduct();
		
		Product product = new Product();
		product.setProductName("leche");
		product.setCreateBye("Aroon");
		product.setPrice("10.00");
		product.setAttribute("lata");
		
		productDAO.saveProduct(product);
		testFindAllProduct();
		setComplete();
		
	}
	
	

	public void ProductName(){
		
		System.out.println("::: "+productDAO.findProductById(3L));
		Product product = productDAO.findProductById(3L);
		
		System.out.println("ProductType: "+product.getProductType());
		System.out.println("ProductName: "+product.getProductName());
		
	}
	

	public void testDeleteProduct(){
		Product product = productDAO.findProductById(4L);
		productDAO.deleteProduct(product);
		setComplete();
	}
	
}
