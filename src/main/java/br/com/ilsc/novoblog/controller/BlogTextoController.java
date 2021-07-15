package br.com.ilsc.novoblog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.ilsc.novoblog.model.Blog;
import br.com.ilsc.novoblog.repository.BlogRepository;

@Controller
public class BlogTextoController {

	@Autowired
	BlogRepository blogRepository;

	@GetMapping("**/textoDoBlog/{idTextoBlog}")
	public ModelAndView mostraBlog(@PathVariable("idTextoBlog") Long id) {

		ModelAndView mv = new ModelAndView("blogtexto");

		Optional<Blog> blog = blogRepository.findById(id);

		mv.addObject("blogObj", blog.get());

		return mv;
	}

	@GetMapping("**/editarTexto/{idTexto}")
	public ModelAndView editar(@PathVariable("idTexto") Long id) {

		ModelAndView mv = new ModelAndView("novo/formNovoBlog");
		Optional<Blog> blog = blogRepository.findById(id);

		mv.addObject("blogObj", blog.get());
		return mv;
	}
}
