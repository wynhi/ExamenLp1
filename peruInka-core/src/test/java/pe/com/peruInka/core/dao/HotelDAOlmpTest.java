package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Hotel;

public class HotelDAOlmpTest extends AbstractUnitTest {
	
	@Autowired
	protected HotelDAO hotelDAO;
	

	public void testFindAllHotel() {
		System.out.println("===" + hotelDAO.findAllHotel());
	}



	public void testSaveHotel() {
		testFindAllHotel();
		
		Hotel hotel = new Hotel();
		hotel.setAddress("Jr: Limao 212121");
		hotel.setBusinessName("LosAndes");
		hotel.setRuc("120392103");
		hotel.setPhone("987654321");
		
		hotelDAO.saveHotel(hotel);
		testFindAllHotel();
		setComplete();
		
	}
	
	

	public void testFindAllHotelById(){
		
		System.out.println("::: "+hotelDAO.findHotelById(3L));
		Hotel hotel = hotelDAO.findHotelById(3L);
		
		System.out.println("Name: "+hotel.getBusinessName());
		System.out.println("Address: "+hotel.getAddress());
		
	}
	

	public void testDeleteHotel(){
		Hotel hotel = hotelDAO.findHotelById(4L);
		hotelDAO.deleteHotel(hotel);
		setComplete();
	}
	
	

}
