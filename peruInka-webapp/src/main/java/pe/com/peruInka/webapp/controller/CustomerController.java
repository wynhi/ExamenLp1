package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.service.services.PeruInkaService;

public class CustomerController {
	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "home/customer", method = RequestMethod.GET)
	public String homeCustomer(Model model, HttpServletRequest request) {
		model.addAttribute("listCustomer", peruInkaService.findAllCustomer());

		request.getSession().setAttribute("menuHeader", "home");
	
		System.out.println("home/customer");

		return "home/customer";
	}

	@RequestMapping(value="home/deleteCustomer",method=RequestMethod.GET)
	public String deleteCustomer(Model model, HttpServletRequest request,@RequestParam("id_") Long id ){
		System.out.println("home/deleteCustomer");
		
		peruInkaService.deleteCustomer(id);
		
		return "redirect:Customer";
	}
	
	@RequestMapping(value = "home/frmCustomer", method = RequestMethod.GET)
	public String newCustomer(Model model, HttpServletRequest request) {
		model.addAttribute("Customer", new pe.com.peruInka.core.domain.Customer());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "home/frmCustomer";
	}
	@ModelAttribute("statusCustomer")
	public List<StatusCustomer> statusCustomerList(){
		return peruInkaService.findStatusCustomer();
	}
	
	@RequestMapping(value = "home/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(Model model, HttpServletRequest request,@ModelAttribute("home") pe.com.peruInka.core.domain.Customer Customer) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.saveCustomer(Customer);
		}else{
//			peruInkaService.updatePerson(person);
		}
		
		return "redirect:Customer";
	}
	
	
	@RequestMapping(value = "home/editCustomer", method = RequestMethod.GET)
	public String editCustomer(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("Customer", peruInkaService.searchCustomer(id));
		model.addAttribute("opc", "update");
		return "home/frmCustomer";
	}
}
