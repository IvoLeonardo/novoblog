package br.com.ilsc.novoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilsc.novoblog.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
