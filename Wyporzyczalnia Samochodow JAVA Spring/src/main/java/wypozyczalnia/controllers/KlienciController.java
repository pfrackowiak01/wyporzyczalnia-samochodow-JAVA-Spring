package wypozyczalnia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import wypozyczalnia.models.Klienci;
import wypozyczalnia.models.Rezerwacje;
import wypozyczalnia.models.Samochody;
import wypozyczalnia.services.RezerwacjeService;
import wypozyczalnia.services.KlienciService;
import wypozyczalnia.services.SamochodyService;

@Controller
public class KlienciController {

	@Autowired
	private KlienciService service;
	
	public KlienciController() {
		
	}
	
	@RequestMapping("/list_klienci")
	public String viewKliencisList(Model model) {
		List<Klienci> lk=service.findAll();
		model.addAttribute("lk", lk);
		return "klienci/list_klienci";
	}

	@RequestMapping("/new_klienci")
	public String showFormNewKlienci(Model model) {
	 Klienci nk = new Klienci();
	 model.addAttribute("klienci", nk);
	 return "klienci/new_klienci";
	}

	@PostMapping(value="/save_klienci")
	public String saveKlienci(@ModelAttribute("klienci") Klienci klienci) {
	 service.save(klienci);
	 return "redirect:/list_klienci";
	}

	@RequestMapping("/edit_klienci/{idb}")
	public ModelAndView showEditFormKlienci(@PathVariable(name = "idb") Long idb) {
	 	ModelAndView mav = new ModelAndView("klienci/edit_klienci");
	 	Optional<Klienci> eb = service.findById(idb);
	 	mav.addObject("klienci", eb);
	 return mav;
	}
	
	@RequestMapping("/delete_klienci/{idb}")
	public String deleteKlienci(@PathVariable(name = "idb") Long idb) {
	 service.deleteById(idb);
	 return "redirect:/list_klienci";
	}
}
