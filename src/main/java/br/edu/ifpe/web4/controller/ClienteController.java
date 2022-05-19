package br.edu.ifpe.web4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifpe.web4.model.Cliente;
import br.edu.ifpe.web4.services.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/listarClientes")
	public String listarCientes(Model model) {
		List<Cliente> listaClientes = clienteService.listarClientes();
		model.addAttribute("lista", listaClientes);
		return "index";
	}

}
