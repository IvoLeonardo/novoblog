package br.com.ilsc.novoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ilsc.novoblog.model.Blog;
import br.com.ilsc.novoblog.repository.AutorRepository;
import br.com.ilsc.novoblog.repository.BlogRepository;

@Controller
public class NovoBlogController {

	@Autowired
	BlogRepository blogRepository;

	@Autowired
	AutorRepository autorRepository;

	@GetMapping("/formNovoBlog")
	public ModelAndView inicio() {

		ModelAndView mv = new ModelAndView("novo/formNovoblog");

		mv.addObject("blogObj", new Blog());
		mv.addObject("autores", blogRepository.findAll());
		return mv;
	}

//	@PostMapping("**/salvarNovoBlog")
//	public String blog(RequisicaoBlog requisicao) {
//
//		Blog blog = requisicao.toBlog();
//
//		blogRepository.save(blog);
//
//		return "redirect:/bloghome";
//	}

//	@PostMapping("**/salvarNovoBlog")
//	public ModelAndView salvar(RequisicaoBlog requisicao) {
//
//		Blog blog = requisicao.toBlog();
//		blogRepository.save(blog);
//
//		ModelAndView mv = new ModelAndView("redirect:/bloghome");
//		mv.addObject("blogObj", new Blog());
//		mv.addObject("blogs", blogRepository.findAll());
////		mv.addObject("autores", autorRepository.findAll());
//
//		return mv;
//	}

	@PostMapping("**/salvarNovoBlog")
	public ModelAndView salvar(Blog blog) {

//		Blog blog = requisicao.toBlog();
		blogRepository.save(blog);

		ModelAndView mv = new ModelAndView("redirect:/bloghome");

//		model.addAttribute("blogObj", new Blog());
//		model.addAttribute("blogs", blogRepository.findAll());
//		mv.addObject("autores", autorRepository.findAll());

		return mv;
	}
}
