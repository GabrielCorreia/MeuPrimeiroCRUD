package br.com.biieel.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.biieel.livro.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
