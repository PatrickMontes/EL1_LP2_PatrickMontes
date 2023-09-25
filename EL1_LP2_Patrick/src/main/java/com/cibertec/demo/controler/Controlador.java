package com.cibertec.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.demo.interfaceService.InterfaceEmpleadoService;
import com.cibertec.demo.model.Empleados;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private InterfaceEmpleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
	    List<Empleados> empleados = service.listar();
	    model.addAttribute("empleados", empleados);
	    System.out.println("Accedido al método listar"); // Agrega esta línea
	    return "index";
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("empleados", new Empleados());
		System.out.println("Accedido al método agregar");
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Empleados e, Model model) {
		service.save(e);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{idEmpleado}")
	public String editar(@PathVariable int idEmpleado, Model model) {
		Optional<Empleados>empleados = service.listarId(idEmpleado);
		model.addAttribute("empleados", empleados);
		return "form";
	}
	@GetMapping("/eliminar/{idEmpleado}")
	public String eliminar(Model model, @PathVariable int idEmpleado) {
		service.eliminar(idEmpleado);
		return "redirect:/listar";
	}
}
