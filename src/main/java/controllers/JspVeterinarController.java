package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.Veterinar;
import services.interfaces.IVeterinarService;

@Controller
@RequestMapping("/jsp")
public class JspVeterinarController {
	
	@Autowired
	IVeterinarService veterinarService;
	
	
	@RequestMapping("/veterinars")
	public ModelAndView veterinars() {
		ModelAndView mav = new ModelAndView("veterinar");
		/*mav.addObject("pageTitle","Our first page in JSP");
		mav.addObject("ourFirstVariable", 4);*/
		mav.addObject("veterinars", veterinarService.getAll());// da izlistamo sve
		return mav;
		
	}
	@RequestMapping("/addVeterinar")
	public ModelAndView saveVeterinar() {
		ModelAndView mav = new ModelAndView("addVeterinar");
		mav.addObject("vet", new Veterinar());
		return mav;
		
	}
	
	@RequestMapping(path = "/saveVeterinar", method = RequestMethod.POST)
		public String  saveVeterinar(@ModelAttribute("vet") Veterinar v) {
		veterinarService.addVet(v);
		return  "redirect:veterinars" ;
		
	}

}
