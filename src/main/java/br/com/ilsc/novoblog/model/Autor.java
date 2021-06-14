package br.com.ilsc.novoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAutor;

//	@OneToMany
//	private List<Blog> blogs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String autor) {
		this.nomeAutor = autor;
	}

//	public List<Blog> getBlogs() {
//		return blogs;
//	}
//
//	public void setBlogs(List<Blog> blogs) {
//		this.blogs = blogs;
//	}

}
