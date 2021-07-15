package br.com.ilsc.novoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

	@GetMapping("/contato")
	public String inicio() {

		return "contato";
	}
}
