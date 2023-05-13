package wypozyczalnia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import wypozyczalnia.models.Klienci;
import wypozyczalnia.models.Rezerwacje;
import wypozyczalnia.models.Samochody;
import wypozyczalnia.services.RezerwacjeService;
import wypozyczalnia.services.KlienciService;
import wypozyczalnia.services.SamochodyService;

@Controller
public class RezerwacjeController {

	@Autowired
	private RezerwacjeService service;
	@Autowired
	private KlienciService serviceK;
	@Autowired
	private SamochodyService serviceS;
	
	public RezerwacjeController() {
		
	}
	
	@RequestMapping("/list_rezerwacje")
	public String viewRezerwacjesList(Model model) {
		List<Rezerwacje> lk=service.findAll();
		model.addAttribute("lk", lk);
		return "rezerwacje/list_rezerwacje";
	}

	@RequestMapping("/new_rezerwacje")
	public String showFormNewRezerwacje(Model model) {
	 Rezerwacje nk = new Rezerwacje();
	 model.addAttribute("rezerwacje", nk);
	 return "rezerwacje/new_rezerwacje";
	}

	@PostMapping(value="/save_rezerwacje")
	public String saveRezerwacje(@ModelAttribute("rezerwacje") Rezerwacje rezerwacje) {
	 service.save(rezerwacje);
	 return "redirect:/list_rezerwacje";
	}

	@RequestMapping("/edit_rezerwacje/{idc}")
	public ModelAndView showEditFormRezerwacje(@PathVariable(name = "idb") Long idb) {
	 ModelAndView mav = new ModelAndView("edit_rezerwacje");
	 Optional<Rezerwacje> eb = service.findById(idb);
	 mav.addObject("rezerwacje", eb);
	 List<Klienci> lp=serviceK.findAll();
	 mav.addObject("lp", lp);
	 List<Samochody> lc=serviceS.findAll();
	 mav.addObject("lc", lc);
	 return mav;
	}
	
	@RequestMapping("/delete_rezerwacje/{idc}")
	public String deleteRezerwacje(@PathVariable(name = "idc") Long idc) {
	 service.deleteById(idc);
	 return "redirect:/list_rezerwacje";
	}
}
