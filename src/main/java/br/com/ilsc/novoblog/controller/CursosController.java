package br.com.ilsc.novoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursosController {

	@GetMapping("/cursos")
	public String inicio() {

		return "cursos";
	}
}
