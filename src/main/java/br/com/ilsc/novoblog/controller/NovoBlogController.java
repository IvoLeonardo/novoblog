package br.com.ilsc.novoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ilsc.novoblog.dto.RequisicaoBlog;
import br.com.ilsc.novoblog.model.Blog;
import br.com.ilsc.novoblog.repository.BlogRepository;

@Controller
public class NovoBlogController {

	@Autowired
	BlogRepository blogRepository;

	@GetMapping("/formNovoBlog")
	public String inicio() {
		return "novo/formNovoblog";
	}

	@PostMapping("**/salvarNovoBlog")
	public String blog(RequisicaoBlog requisicao) {

		Blog blog = requisicao.toBlog();

		blogRepository.save(blog);

		return "redirect:/bloghome";
	}
}
