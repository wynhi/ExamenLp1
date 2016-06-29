package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicketDescription;

import pe.com.peruInka.core.domain.TicketDescription;

public interface TicketDescriptionDAO {
	
	
	List<TicketDescription> findAllTicketDescription();
	List<StatusTicketDescription> findStatusTicketDescription();
	TicketDescription findTicketDescriptionById(Long id);
	void deleteTicketDescription(TicketDescription ticketDescription);
	void saveTicketDescription(TicketDescription ticketDescription);

}
