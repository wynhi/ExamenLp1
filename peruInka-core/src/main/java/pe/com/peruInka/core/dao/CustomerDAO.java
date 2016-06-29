package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Customer;

import pe.com.peruInka.core.domain.StatusCustomer;


public interface CustomerDAO {

	

	 List<Customer> findAllCustomer();

	 List<StatusCustomer> findStatusCustomer();

     void saveCustomer(Customer customer);

	 Customer findCustomerById(Long id);

	 void deleteCustomer(Customer customer);

}
