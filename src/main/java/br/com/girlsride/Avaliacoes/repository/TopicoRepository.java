package br.com.girlsride.Avaliacoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.girlsride.Avaliacoes.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nota);

}
