package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
		/*
		 * mav.addObject("pageTitle","Our first page in JSP");
		 * mav.addObject("ourFirstVariable", 4);
		 */
		mav.addObject("veterinars", veterinarService.getAll());// da izlistamo sve
		return mav;

	}

	@RequestMapping(path = "/deleteVeterinar/{id}", method = RequestMethod.POST) /* jer web forma reaguje samo na POST a ne na DELETE	 */
	public RedirectView deleteVeterinar(@PathVariable int id) {
		veterinarService.deleteVeterinar(id);
		return new RedirectView("/vet-amb/jsp/veterinars");
	}

	@RequestMapping("/addVeterinar")
	public ModelAndView saveVeterinar() {
		ModelAndView mav = new ModelAndView("addVeterinar");
		mav.addObject("vet", new Veterinar());
		return mav;
	}

	@RequestMapping(path = "/saveVeterinar", method = RequestMethod.POST)
	public String saveVeterinar(@ModelAttribute("vet") Veterinar v) {
		veterinarService.addVet(v);
		return "redirect:veterinars";
	}

	@RequestMapping("/editVeterinar/{id}")/*ovde hvata id sa hidden id koji je u spring bind u <spring:bind path="id">
		<form:hidden path="id"/>
	</spring:bind> u editVeterinar*/
	public ModelAndView editVeterinar(@PathVariable int id) {
		Veterinar selectedVeterinar = veterinarService.getVetById(id);//Sa id hvatamo veterinara koji ma taj ID
		//veterinarService.updateVeterinar(id, v);
		ModelAndView mav = new ModelAndView("editVeterinar");/*ovde hvatamo kojem jsp-u cemo da prosledimo selectedVeterinar da bi siti bio prosledjen
		kroz formu doEdit methodi preko @ModelAttribute-a*/
		mav.addObject("editVet", selectedVeterinar);//ovde dodajemo veterinara sa tim ID-em formi da bi isti bio uhvacen dole
		return mav;
	}

	@RequestMapping(path = "/editVeterinar", method = RequestMethod.POST)
	public RedirectView doEdit(@ModelAttribute("editVet") Veterinar v) {//ovde ga hvatamo tako da bude updatovan ispod i to je to
		veterinarService.updateVeterinar(v.getId(), v);
		return new RedirectView("/vet-amb/jsp/veterinars");
	}
}