package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicket;
import pe.com.peruInka.core.domain.Ticket;


public class TicketDAOlmpl extends BaseDAOHibernate implements TicketDAO{

	
	
	
	public List<Ticket> findAllTicket() {
		return find(Ticket.class, "from ticket");
	}

	public List<StatusTicket> findStatusTicket() {
		return find(StatusTicket.class, "from StatusTicket");
	}

	public Ticket findTicketById(Long id) {
		return findById(Ticket.class, id);
	}

	public void deleteTicket(Ticket ticket) {
		delete(ticket);
	}

	public void saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
	       saveTicket(ticket);	
	}
}



