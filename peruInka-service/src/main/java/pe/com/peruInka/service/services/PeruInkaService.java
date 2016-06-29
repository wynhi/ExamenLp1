package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.CustomerDAO;
import pe.com.peruInka.core.dao.HotelDAO;
import pe.com.peruInka.core.dao.PersonDAO;
import pe.com.peruInka.core.dao.ProductDAO;
import pe.com.peruInka.core.dao.TicketDAO;
import pe.com.peruInka.core.dao.TicketDescriptionDAO;
import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.StatusTicket;
import pe.com.peruInka.core.domain.StatusTicketDescription;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.Ticket;
import pe.com.peruInka.core.domain.TicketDescription;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> listPerson = new ArrayList<Person>();
	public static List<Hotel> listHotel = new ArrayList<Hotel>();
	public static List<Product> listProduct = new ArrayList<Product>();
	public static List<Customer> listCustomer = new ArrayList<Customer>();
	public static List<Ticket> listTicket = new ArrayList<Ticket>();
	public static List<TicketDescription> listTicketDescription = new ArrayList<TicketDescription>();
	@Autowired
	private PersonDAO personDAO;
	
//	@Autowired
	private HotelDAO hotelDAO;
	
	@Autowired
	 
	private ProductDAO productDAO;

	
	@Autowired
	 
	private CustomerDAO customerDAO;
	
	@Autowired
	 
	private TicketDAO ticketDAO;
	
	@Autowired
	private TicketDescriptionDAO ticketDescriptionDAO;
	
	// UserSystem findUserSystemById(Long id);
	//
	// void deleteUserSystem(UserSystem userSystem);

	public void deleteUserSystem(Long id) {
		UserSystem userSystem = personDAO.findUserSystemById(id);
		personDAO.deleteUserSystem(userSystem);
	}

	public Hotel findAllHotelById(Long id) {
		return hotelDAO.findHotelById(id);
	}
	public Product findAllProductById(Long id) {
		return productDAO.findProductById(id);
	}
	public Customer findAllCustomerById(Long id) {
		return customerDAO.findCustomerById(id);
	}
	public Ticket findAllTicketById(Long id) {
		return ticketDAO.findTicketById(id);
	}
	public TicketDescription findAllTicketDescriptionById(Long id) {
		return ticketDescriptionDAO.findTicketDescriptionById(id);
	}

	public UserSystem findUserSystemById(Long id) {
		return personDAO.findUserSystemById(id);
	}

	public List<StatusPerson> findStatusPerson() {
		return personDAO.findStatusPerson();
	}

	public List<StatusUser> findStatusUser() {
		return personDAO.findStatusUser();
	}

	public List<StatusHotel> findStatusHotel() {
		return hotelDAO.findStatusHotel();
	}
	public List<StatusProduct> findStatusProduct() {
		return productDAO.findStatusProduct();
	}
	public List<StatusCustomer> findStatusCustomer() {
		return customerDAO.findStatusCustomer();
	}

	public List<StatusTicket> findStatusTicket() {
		return ticketDAO.findStatusTicket();
	}
	public List<StatusTicketDescription> findStatusTicketDescription() {
		return ticketDescriptionDAO.findStatusTicketDescription();
	}
	public List<TypeDocument> findTypeDocument() {
		return personDAO.findTypeDocument();
	}

	
	public List<pe.com.peruInka.core.domain.Person> findAllPerson() {
		return personDAO.findAllPerson();
		// return listPerson;
	}

	public List<Hotel> findAllHotel() {
		return hotelDAO.findAllHotel();
	}

	public List<Product> findAllProduct() {
		return productDAO.findAllProduct();
	}
	public List<Customer> findAllCustomer() {
		return customerDAO.findAllCustomer();
	}
	public List<Ticket> findAllTicket() {
		return ticketDAO.findAllTicket();
	}
	public List<TicketDescription> findAllTicketDescription() {
		return ticketDescriptionDAO.findAllTicketDescription();
	}


	public void savePerson(pe.com.peruInka.core.domain.Person person) {
		// listPerson.add(person);
		personDAO.savePerson(person);
	}

	public void saveHotel(Hotel hotel) {
		// listPerson.add(person);
		hotelDAO.saveHotel(hotel);
	} 
	public void saveProduct(Product product) {
		// listPerson.add(person);
		productDAO.saveProduct(product);
	}
	public void saveCustomer(Customer customer) {
		// listPerson.add(person);
		customerDAO.saveCustomer(customer);
	}
	public void saveTicket(Ticket ticket) {
		// listPerson.add(person);
		ticketDAO.saveTicket(ticket);
	}
	public void saveTicketDescripition(TicketDescription ticketDescription) {
		// listPerson.add(person);
		ticketDescriptionDAO.saveTicketDescription(ticketDescription);
	}


	public List<UserSystem> findUserSystem() {
		return personDAO.findUserSystem();
	}

	public void saveUserSystem(UserSystem userSystem) {
		if (userSystem.getId() == null) {
			personDAO.saveUserSystem(userSystem);
		} else {
			personDAO.updateUserSystem(userSystem);
		}
	}

	public void deletePerson(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Person> listPersoTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) != 0) {
				listPersoTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listPersoTemp);
	}

	public void deleteHotel(Long id) {
		Hotel hotel = hotelDAO.findHotelById(id);
		hotelDAO.deleteHotel(hotel);
	}
	public void deleteProduct(Long id) {
		Product product = productDAO.findProductById(id);
		productDAO.deleteProduct(product);
	}

	public void deleteCustomer(Long id) {
		Customer customer = customerDAO.findCustomerById(id);
		customerDAO.deleteCustomer(customer);
	}
	public void deleteTicket(Long id) {
		Ticket ticket = ticketDAO.findTicketById(id);
		ticketDAO.deleteTicket(ticket);
	}
	public void deleteTicketDescription(Long id) {
		TicketDescription ticketDescription = ticketDescriptionDAO.findTicketDescriptionById(id);
		ticketDescriptionDAO.deleteTicketDescription(ticketDescription);
	}
	public void updatePerson(Person personUpdate) {
		List<Person> listTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (personUpdate.getId().compareTo(person.getId()) == 0) {
				listTemp.add(personUpdate);
			} else {
				listTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listTemp);
          
		
	}
	public void updateProduct(Product productUpdate) {
		List<Product> listTemp = new ArrayList<Product>();

		for (Product product : listProduct) {
			if (productUpdate.getId().compareTo(product.getId()) == 0) {
				listTemp.add(productUpdate);
			} else {
				listTemp.add(product);
			}
		}
		listProduct = new ArrayList<Product>();
		listProduct.addAll(listTemp);


	
	}
	public void updateCustomer(Customer customerUpdate) {
		List<Customer> listTemp = new ArrayList<Customer>();

		for (Customer customer : listCustomer) {
			if (customerUpdate.getId().compareTo(customer.getId()) == 0) {
				listTemp.add(customerUpdate);
			} else {
				listTemp.add(customer);
			}
		}
		listCustomer = new ArrayList<Customer>();
		listCustomer.addAll(listTemp);


	
	}
	
	public void updateTicket(Ticket ticketUpdate) {
		List<Ticket> listTemp = new ArrayList<Ticket>();

		for (Ticket ticket : listTicket) {
			if (ticketUpdate.getId().compareTo(ticket.getId()) == 0) {
				listTemp.add(ticketUpdate);
			} else {
				listTemp.add(ticket);
			}
		}
		listTicket = new ArrayList<Ticket>();
		listTicket.addAll(listTemp);


	
	}
	public void updateTicketDescription(TicketDescription ticketDescriptionUpdate) {
		List<TicketDescription> listTemp = new ArrayList<TicketDescription>();

		for (TicketDescription ticketDescription : listTicketDescription) {
			if (ticketDescriptionUpdate.getId().compareTo(ticketDescription.getId()) == 0) {
				listTemp.add(ticketDescriptionUpdate);
			} else {
				listTemp.add(ticketDescription);
			}
		}
		listTicketDescription = new ArrayList<TicketDescription>();
		listTicketDescription.addAll(listTemp);


	
	}
	public Person searchPerson(Long id) {
		Person personReturn = new Person();
		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) == 0) {
				personReturn = person;
				continue;
			}
		}
		return personReturn;
	}

	public Hotel searchHotel(Long id) {
		return hotelDAO.findHotelById(id);

	}

	public Product searchProduct(Long id) {
		return productDAO.findProductById(id);

	}
	public Customer searchCustomer(Long id) {
		return customerDAO.findCustomerById(id);

	}
	public Ticket searchTicket(Long id) {
		return ticketDAO.findTicketById(id);

	}

	public TicketDescription searchTicketDescription(Long id) {
		return ticketDescriptionDAO.findTicketDescriptionById(id);

	}


	
	
	
}