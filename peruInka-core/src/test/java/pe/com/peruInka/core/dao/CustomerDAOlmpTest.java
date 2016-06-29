package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Customer;

public class CustomerDAOlmpTest extends AbstractUnitTest{
   
	

	@Autowired
	protected CustomerDAO customerDAO;
	

	public void testFindAllCustomer() {
		System.out.println("===" + customerDAO.findAllCustomer());
	}



	public void testSaveCustomer() {
		testFindAllCustomer();
		
		Customer customer = new Customer();
		customer.setCreateBy("");
		customer.setCreatedBy("");
		customer.setLastUpdatedBy(":::");
		
		
		customerDAO.saveCustomer(customer);
		testFindAllCustomer();
		setComplete();
		
	}
	
	

	public void CustomerName(){
		
		System.out.println("::: "+customerDAO.findCustomerById(3L));
		Customer customer = customerDAO.findCustomerById(3L);
		
		System.out.println(":::: "+customer.getLastUpdatedBy());
		System.out.println(":::: "+customer.getCreateBy());
		
	}
	

	public void testDeleteCustomer(){
		Customer customer = customerDAO.findCustomerById(4L);
		customerDAO.deleteCustomer(customer);
		setComplete();
	}
	
}
