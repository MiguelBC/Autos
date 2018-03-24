package edu.usmp.autos.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import edu.usmp.autos.model.Autos;


@Controller
public class AutosController{
	

	
	@GetMapping("/evaluar")
	public String inicioForm(Model model) {
		model.addAttribute("autos", new Autos());
		return "autosForm";
	}
	
	@PostMapping("/evaluar")
	public String evaluar(@ModelAttribute Autos autos) {
		
		
		if(autos.getMarca().equals("a")) {
			
			autos.setGalon(autos.getRecorrido()/40.0);
			
		}else if(autos.getMarca().equals("b")) {
			
			autos.setGalon(autos.getRecorrido()/35.0);
			
		}else if(autos.getMarca().equals("c")) {
			
			autos.setGalon(autos.getRecorrido()/45.0);
			
		}
		
		autos.setMensaje(" Para su recorrido de " + autos.getRecorrido() + " km." +
				"necesitará " + autos.getGalon() + " galones");
		
		return "resultForm";
	}
	
	
	
	
}