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
	private String autor;

//	@OneToMany
//	private List<Blog> blogs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

//	public List<Blog> getBlogs() {
//		return blogs;
//	}
//
//	public void setBlogs(List<Blog> blogs) {
//		this.blogs = blogs;
//	}

}
