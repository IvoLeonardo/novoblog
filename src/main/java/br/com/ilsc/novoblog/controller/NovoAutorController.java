package br.com.ilsc.novoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ilsc.novoblog.model.Autor;
import br.com.ilsc.novoblog.repository.AutorRepository;

@Controller
//@RequestMapping("novo")
public class NovoAutorController {

	@Autowired
	private AutorRepository autorRepository;

	@GetMapping("/formNovoAutor")
	public String inicio() {

		return "novo/formNovoAutor";
	}

	@PostMapping("/salvarAutor")
	public String salvar(Autor autor) {

		autorRepository.save(autor);

//		ModelAndView mv = new ModelAndView("novo/formNovoAutor");
//
//		mv.addObject("autores", autorRepository.findAll());
		return "novo/formNovoAutor";
	}
}
