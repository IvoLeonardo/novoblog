package br.com.ilsc.novoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ilsc.novoblog.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
