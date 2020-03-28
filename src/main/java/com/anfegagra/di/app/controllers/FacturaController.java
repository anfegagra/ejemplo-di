package com.anfegagra.di.app.controllers;

import com.anfegagra.di.app.domain.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/factura")
@Controller
public class FacturaController {

	@Autowired
	private Factura factura;

	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("titulo", "Ejemplo de Factura con inyección de dependencias");
		model.addAttribute("factura", factura);
		return "factura/ver";
	}
}
