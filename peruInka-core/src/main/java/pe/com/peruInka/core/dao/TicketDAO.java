package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicket;
import pe.com.peruInka.core.domain.Ticket;

public interface TicketDAO {

	
	
	List<Ticket> findAllTicket();
	List<StatusTicket> findStatusTicket();
	Ticket findTicketById(Long id);
	void deleteTicket(Ticket ticket);
	void saveTicket(Ticket ticket);
}
