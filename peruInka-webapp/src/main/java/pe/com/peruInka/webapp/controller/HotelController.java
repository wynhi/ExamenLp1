package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class HotelController {
	
	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "home/hotel", method = RequestMethod.GET)
	public String homeHotel(Model model, HttpServletRequest request) {
		model.addAttribute("listHotel", peruInkaService.findAllHotel());

		request.getSession().setAttribute("menuHeader", "home");
	
		System.out.println("home/hotel");

		return "home/hotel";
	}

	@RequestMapping(value="home/deleteHotel",method=RequestMethod.GET)
	public String deleteHotel(Model model, HttpServletRequest request,@RequestParam("id_") Long id ){
		System.out.println("home/deleteHotel");
		
		peruInkaService.deleteHotel(id);
		
		return "redirect:Hotel";
	}
	
	@RequestMapping(value = "home/frmHotel", method = RequestMethod.GET)
	public String newHotel(Model model, HttpServletRequest request) {
		model.addAttribute("Hotel", new pe.com.peruInka.core.domain.Hotel());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "home/frmHotel";
	}
	@ModelAttribute("statusHotel")
	public List<StatusHotel> statusHotelList(){
		return peruInkaService.findStatusHotel();
	}
	
	@RequestMapping(value = "home/saveHotel", method = RequestMethod.POST)
	public String saveHotel(Model model, HttpServletRequest request,@ModelAttribute("home") pe.com.peruInka.core.domain.Hotel hotel) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.saveHotel(hotel);
		}else{
//			peruInkaService.updatePerson(person);
		}
		
		return "redirect:hotel";
	}
	
	
	@RequestMapping(value = "home/editHotel", method = RequestMethod.GET)
	public String editHotel(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("hotel", peruInkaService.searchHotel(id));
		model.addAttribute("opc", "update");
		return "home/frmHotel";
	}

}
