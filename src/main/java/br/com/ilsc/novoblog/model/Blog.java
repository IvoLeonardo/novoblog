package br.com.ilsc.novoblog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "blogs")
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	@Lob
	private String texto;
	private LocalDate dataPublicacao = LocalDate.now();
	public String autor;

	@Enumerated(EnumType.STRING)
	private StatusBlog status;

	public Blog(String titulo, String texto, StatusBlog status, LocalDate dataPublicacao, String autor) {
		this.titulo = titulo;
		this.texto = texto;
		this.status = status;
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
	}

	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public StatusBlog getStatus() {
		return status;
	}

	public void setStatus(StatusBlog status) {
		this.status = status;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
