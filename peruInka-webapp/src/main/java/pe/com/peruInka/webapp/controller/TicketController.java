package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusTicket;
import pe.com.peruInka.service.services.PeruInkaService;

public class TicketController {

         
	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "home/ticket", method = RequestMethod.GET)
	public String homeTicket(Model model, HttpServletRequest request) {
		model.addAttribute("listTicket", peruInkaService.findAllTicket());

		request.getSession().setAttribute("menuHeader", "home");
	
		System.out.println("home/ticket");

		return "home/ticket";
	}

	@RequestMapping(value="home/deleteTicket",method=RequestMethod.GET)
	public String deleteTicket(Model model, HttpServletRequest request,@RequestParam("id_") Long id ){
		System.out.println("home/deleteTicket");
		
		peruInkaService.deleteTicket(id);
		
		return "redirect:Ticket";
	}
	
	@RequestMapping(value = "home/frmTicket", method = RequestMethod.GET)
	public String newTicket(Model model, HttpServletRequest request) {
		model.addAttribute("ticket", new pe.com.peruInka.core.domain.Ticket());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "home/frmTicket";
	}
	@ModelAttribute("statusTicket")
	public List<StatusTicket> statusTicketList(){
		return peruInkaService.findStatusTicket();
	}
	
	@RequestMapping(value = "home/saveTicket", method = RequestMethod.POST)
	public String saveTicket(Model model, HttpServletRequest request,
			@ModelAttribute("ticket") pe.com.peruInka.core.domain.Ticket ticket) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.saveTicket(ticket);
		}else{
//			peruInkaService.updatePerson(person);
		}
		
		return "redirect:home";
	}
	
	
	@RequestMapping(value = "home/editTicket", method = RequestMethod.GET)
	public String editTicket(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("ticket", peruInkaService.searchTicket(id));
		model.addAttribute("opc", "update");
		return "home/frmTicket";
	}
}
