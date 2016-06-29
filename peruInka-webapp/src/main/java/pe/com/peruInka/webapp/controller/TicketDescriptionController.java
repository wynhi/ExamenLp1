package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusTicketDescription;
import pe.com.peruInka.service.services.PeruInkaService;

public class TicketDescriptionController {

    
	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "home/ticketDescription", method = RequestMethod.GET)
	public String homeTicketDescription(Model model, HttpServletRequest request) {
		model.addAttribute("listTicketDescription", peruInkaService.findAllTicketDescription());

		request.getSession().setAttribute("menuHeader", "home");
	
		System.out.println("home/ticketDescription");

		return "home/ticketDescription";
	}

	@RequestMapping(value="home/deleteTicketDescription",method=RequestMethod.GET)
	public String deleteTicketDescription(Model model, HttpServletRequest request,@RequestParam("id_") Long id ){
		System.out.println("home/deleteTicketDescription");
		
		peruInkaService.deleteTicketDescription(id);
		
		return "redirect:TicketDescription";
	}
	
	@RequestMapping(value = "home/frmTicketDescription", method = RequestMethod.GET)
	public String newTicket(Model model, HttpServletRequest request) {
		model.addAttribute("ticketDescription", new pe.com.peruInka.core.domain.TicketDescription());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "home/frmTicketDescription";
	}
	@ModelAttribute("statusTicketDescription")
	public List<StatusTicketDescription> statusTicketDescriptionList(){
		return peruInkaService.findStatusTicketDescription();
	}
	
	@RequestMapping(value = "home/saveTicketDescription", method = RequestMethod.POST)
	public String saveTicketDescription(Model model, HttpServletRequest request,
			@ModelAttribute("ticketDescription") pe.com.peruInka.core.domain.TicketDescription ticketDescription) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.saveTicketDescripition(ticketDescription);
		}else{
//			peruInkaService.updatePerson(person);
		}
		
		return "redirect:home";
	}
	
	
	@RequestMapping(value = "home/editTicketDescription", method = RequestMethod.GET)
	public String editTicketDescription(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("ticketDescription", peruInkaService.searchTicketDescription(id));
		model.addAttribute("opc", "update");
		return "home/frmTicketDescription";
	}
}


