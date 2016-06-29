package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicketDescription;
import pe.com.peruInka.core.domain.TicketDescription;

public class TicketDescriptionDAOlmpl extends BaseDAOHibernate implements TicketDescriptionDAO{

	
	public List<TicketDescription> findAllTicketDescription() {
		return find(TicketDescription.class, "from ticketDescription");
	}

	public List<StatusTicketDescription> findStatusTicketDescription() {
		return find(StatusTicketDescription.class, "from StatusTicketDescription");
	}

	public TicketDescription findTicketDescriptionById(Long id) {
		return findById(TicketDescription.class, id);
	}

	public void deleteTicketDescription(TicketDescription ticketDescription) {
		delete(ticketDescription);
	}

	public void saveTicketDescription(TicketDescription ticketDescription) {
		// TODO Auto-generated method stub
	       saveTicketDescription(ticketDescription);	
	}
}
