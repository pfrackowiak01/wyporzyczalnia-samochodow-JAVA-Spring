package wypozyczalnia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/home2")
	public String home2() {
		return "home2";
	}
	
	@GetMapping("/firma")
	public String firma() {
		return "firma";
	}
	
	@GetMapping("/kontakt")
	public String kontakt() {
		return "kontakt";
	}
	
	@GetMapping("/oferty")
	public String oferty() {
		return "oferty";
	}
	
	@GetMapping("/potwierdzenie")
	public String potwierdzenie() {
		return "potwierdzenie";
	}
	
	@GetMapping("/pytania")
	public String pytania() {
		return "pytania";
	}
	
	@GetMapping("/regulamin")
	public String regulamin() {
		return "regulamin";
	}
	
	@GetMapping("/wylogowano")
	public String wylogowano() {
		return "wylogowano";
	}
	
	@GetMapping("/wynajem")
	public String wynajem() {
		return "wynajem";
	}
	
	@GetMapping("/wynajmowanie")
	public String wynajmowanie() {
		return "wynajmowanie";
	}
	
	@GetMapping("/zalogowano")
	public String zalogowano() {
		return "zalogowano";
	}
	
	public HomeController() {
		
	}
	
}
