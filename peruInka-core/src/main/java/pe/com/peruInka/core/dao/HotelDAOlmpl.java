package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.StatusHotel;

public class HotelDAOlmpl extends BaseDAOHibernate implements HotelDAO{

	public List<Hotel> findAllHotel() {
		return find(Hotel.class, "from Hotel");
	}

	public List<StatusHotel> findStatusHotel() {
		return find(StatusHotel.class, "from StatusHotel");
	}

	public void saveHotel(Hotel hotel) {
		save(hotel);
	}

	public Hotel findHotelById(Long id) {
		return findById(Hotel.class, id);
	}

	public void deleteHotel(Hotel hotel) {
		delete(hotel);
	}
}
