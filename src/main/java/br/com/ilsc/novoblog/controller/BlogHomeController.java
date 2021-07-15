package br.com.ilsc.novoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ilsc.novoblog.model.Blog;
import br.com.ilsc.novoblog.repository.BlogRepository;

@Controller
public class BlogHomeController {

	@Autowired
	BlogRepository blogRepository;

	@GetMapping("/bloghome")
	public ModelAndView inicio() {

		ModelAndView mv = new ModelAndView("bloghome");

		mv.addObject("blogObj", new Blog());
		mv.addObject("blogs", blogRepository.findAll(PageRequest.of(0, 5, Sort.by("dataPublicacao"))));
		return mv;
	}

	@GetMapping("/blogspag")
	public ModelAndView carregaBlogsPorPaginacao(@PageableDefault(size = 5) Pageable pageable, ModelAndView mv) {

		Page<Blog> pageBlog = blogRepository.findAll(pageable);
		mv.addObject("blogs", pageBlog);
		mv.setViewName("bloghome");

		return mv;
	}
}
