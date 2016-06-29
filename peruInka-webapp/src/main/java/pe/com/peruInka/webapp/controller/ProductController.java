package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.service.services.PeruInkaService;

public class ProductController {
    
	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "home/product", method = RequestMethod.GET)
	public String homeProduct(Model model, HttpServletRequest request) {
		model.addAttribute("listProduct", peruInkaService.findAllProduct());

		request.getSession().setAttribute("menuHeader", "home");
	
		System.out.println("home/product");

		return "home/product";
	}

	@RequestMapping(value="home/deleteProduct",method=RequestMethod.GET)
	public String deleteProduct(Model model, HttpServletRequest request,@RequestParam("id_") Long id ){
		System.out.println("home/deleteProduct");
		
		peruInkaService.deleteProduct(id);
		
		return "redirect:Product";
	}
	
	@RequestMapping(value = "home/frmProduct", method = RequestMethod.GET)
	public String newProduct(Model model, HttpServletRequest request) {
		model.addAttribute("product", new pe.com.peruInka.core.domain.Product());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "home/frmProduct";
	}
	@ModelAttribute("statusProduct")
	public List<StatusProduct> statusProductList(){
		return peruInkaService.findStatusProduct();
	}
	
	@RequestMapping(value = "home/saveProduct", method = RequestMethod.POST)
	public String saveProduct(Model model, HttpServletRequest request,
			@ModelAttribute("product") pe.com.peruInka.core.domain.Product product) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.saveProduct(product);
		}else{
//			peruInkaService.updatePerson(person);
		}
		
		return "redirect:home";
	}
	
	
	@RequestMapping(value = "home/editProduct", method = RequestMethod.GET)
	public String editProduct(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("product", peruInkaService.searchProduct(id));
		model.addAttribute("opc", "update");
		return "home/frmProduct";
	}
}
