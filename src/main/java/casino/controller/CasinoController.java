package casino.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import casino.entity.Casino;
import casino.service.CasinoService;


@Controller
//@RestController
public class CasinoController {
	
	public CasinoService casinoService;

	public CasinoController(CasinoService casinoService) {
		super();
		this.casinoService = casinoService;
	}
	
	
	// handler method to handle list user and return mode and view 
	@GetMapping("/casino")
	public String getusername(@PathVariable Long id,Model model) {
		model.addAttribute("casino", casinoService.getusername(id));
		return "casino";
	}
	
	@GetMapping("/casino/new")
	public String createCasinoForm(Model model) {
		
		// create casino object to hold casino form data
		Casino casinoObject = new Casino();
		model.addAttribute("casinoObject", casinoObject);
		return "new";
		
	}
	
	
	//get player balance 
	@GetMapping("/casino/player/{id}/balance")
	public String editCasinoForm(@PathVariable Long id, Model model) {
		model.addAttribute("casinoObject", casinoService.getbalance(id));
		return "balance";
	}

	
	@PostMapping("casino/player/{id}")
	public String updateCasino(@PathVariable Long id,
			@ModelAttribute("casinoObject") Casino casinoObject,
			Model model) {
		
		// get transaction from database by id
		Casino existingCasino = casinoService.getCasinoById(id);
		existingCasino.setplayerId(id);
		existingCasino.setusername(casinoObject.getusername());
		existingCasino.setamount(casinoObject.getamount());
		existingCasino.setbalance(casinoObject.getbalance(id));

		// save updated transaction 
		casinoService.updateCasino(existingCasino);
		return "redirect:/casino";		
	}
	
}
