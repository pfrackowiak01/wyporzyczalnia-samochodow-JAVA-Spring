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
import wypozyczalnia.models.Ubezpieczenia;
import wypozyczalnia.models.Rezerwacje;
import wypozyczalnia.models.Samochody;
import wypozyczalnia.services.RezerwacjeService;
import wypozyczalnia.services.UbezpieczeniaService;
import wypozyczalnia.services.SamochodyService;

@Controller
public class UbezpieczeniaController {

	@Autowired
	private UbezpieczeniaService service;
	
	public UbezpieczeniaController() {
		
	}
	
	@RequestMapping("/list_ubezpieczenia")
	public String viewUbezpieczeniasList(Model model) {
		List<Ubezpieczenia> lk=service.findAll();
		model.addAttribute("lk", lk);
		return "ubezpieczenia/list_ubezpieczenia";
	}

	@RequestMapping("/new_ubezpieczenia")
	public String showFormNewUbezpieczenia(Model model) {
	 Ubezpieczenia nk = new Ubezpieczenia();
	 model.addAttribute("ubezpieczenia", nk);
	 return "ubezpieczenia/new_ubezpieczenia";
	}

	@PostMapping(value="/save_ubezpieczenia")
	public String saveUbezpieczenia(@ModelAttribute("ubezpieczenia") Ubezpieczenia ubezpieczenia) {
	 service.save(ubezpieczenia);
	 return "redirect:/list_ubezpieczenia";
	}

	@RequestMapping("/edit_ubezpieczenia/{idb}")
	public ModelAndView showEditFormUbezpieczenia(@PathVariable(name = "idb") Long idb) {
	 	ModelAndView mav = new ModelAndView("ubezpieczenia/edit_ubezpieczenia");
	 	Optional<Ubezpieczenia> eb = service.findById(idb);
	 	mav.addObject("ubezpieczenia", eb);
	 return mav;
	}
	
	@RequestMapping("/delete_ubezpieczenia/{idb}")
	public String deleteUbezpieczenia(@PathVariable(name = "idb") Long idb) {
	 service.deleteById(idb);
	 return "redirect:/list_ubezpieczenia";
	}
}