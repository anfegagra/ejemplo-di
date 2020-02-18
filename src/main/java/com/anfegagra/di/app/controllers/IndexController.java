package com.anfegagra.di.app.controllers;

import com.anfegagra.di.app.models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private MiServicio miServicio;

	public IndexController(MiServicio miServicio) {
		this.miServicio = miServicio;
	}

	@GetMapping({"", "/", "/index"})
	public String obtenerPaginaPrincipal(Model model) {
		model.addAttribute("objeto", miServicio.hacerAlgo());
		return "index";
	}
}
