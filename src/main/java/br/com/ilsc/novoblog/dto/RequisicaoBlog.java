package br.com.ilsc.novoblog.dto;

import java.time.LocalDate;

import br.com.ilsc.novoblog.model.Blog;
import br.com.ilsc.novoblog.model.StatusBlog;

public class RequisicaoBlog {

	private String titulo;
	private String texto;
	private String dataPublicacao;
	private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Blog toBlog() {

		Blog blog = new Blog();

		blog.setTitulo(titulo);
		blog.setTexto(texto);
		blog.setStatus(StatusBlog.RASCUNHO);
		blog.setDataPublicacao(LocalDate.now());
		blog.setAutor(autor);

		return blog;
	}

//	public Blog converter(AutorRepository autorRepository) {
//
//		Autor autor = autorRepository.findByNomeAutor(autorNome);
//		return new Blog(titulo, texto, StatusBlog.RASCUNHO, LocalDate.now(), autor);
//	}
}
