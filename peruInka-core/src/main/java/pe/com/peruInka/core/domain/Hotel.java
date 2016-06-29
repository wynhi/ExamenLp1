package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Hotel extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String BusinessName;
	private String ruc ;
	private String address;
	private String phone;
	private StatusHotel statusHotel;
	private String Root;
	private Person personId;
	
	public Person getPersonId() {
		return personId;
	}
	public void setPersonId(Person personId) {
		this.personId = personId;
	}
	
	public String getBusinessName() {
		return BusinessName;
	}
	public void setBusinessName(String businessName) {
		BusinessName = businessName;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public StatusHotel getStatusHotel() {
		return statusHotel;
	}
	public void setStatusHotel(StatusHotel statusHotel) {
		this.statusHotel = statusHotel;
	}
	public String getRoot() {
		return Root;
	}
	public void setRoot(String root) {
		Root = root;
	}
	
	
	
}
