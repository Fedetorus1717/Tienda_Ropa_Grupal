package com.TiendaGrupo2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TiendaGrupo2.interceService.IPersonaService;
import com.TiendaGrupo2.model.Persona;

@Controller
@RequestMapping
public class Controlador 
{
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model)
	{
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
}
