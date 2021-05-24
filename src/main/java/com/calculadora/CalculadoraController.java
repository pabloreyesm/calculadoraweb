package com.calculadora;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class CalculadoraController {

	@GetMapping("/calculadora")
	public String index(Model modelo) 
	{
		modelo.addAttribute("calcu", new Calculadora());
		return "calculadora/index";	
	}
	
	@PostMapping("/resultado")
	public String resultado(@ModelAttribute Calculadora calcu, Model modelo) 
	{
		calcu.Calcular();
		modelo.addAttribute("calcu", calcu);
		return "calculadora/index";	
	}	
}
