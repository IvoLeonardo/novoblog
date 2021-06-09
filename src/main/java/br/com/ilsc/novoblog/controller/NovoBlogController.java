package br.com.ilsc.novoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NovoBlogController {

	@GetMapping("/formNovoBlog")
	public String inicio() {
		return "novo/formNovoblog";
	}
}
