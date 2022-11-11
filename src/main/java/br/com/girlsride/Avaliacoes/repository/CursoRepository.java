package br.com.girlsride.Avaliacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.girlsride.Avaliacoes.model.Nota;

public interface CursoRepository extends JpaRepository<Nota, Long> {

	Nota findByNome(String nome);

}
