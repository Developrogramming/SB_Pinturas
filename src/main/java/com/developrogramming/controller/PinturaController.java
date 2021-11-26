package com.developrogramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.developrogramming.model.Pintura;
import com.developrogramming.services.PinturaService;


@Controller
public class PinturaController {

	@Autowired
	PinturaService pinturaService;	
	
	/**
	 * Para probar este metodo, poner en navegador: http://localhost:8080/
	 * @param model
	 * @return index
	 */
	@GetMapping("/")
	public String get(Model model){
		List<Pintura> modelo = pinturaService.findAll();
		model.addAttribute("listaPinturas", modelo);
		return "index";
		
	}
	
}
