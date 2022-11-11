package br.com.girlsride.Avaliacoes.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.girlsride.Avaliacoes.model.Nota;
import br.com.girlsride.Avaliacoes.model.Topico;
import br.com.girlsride.Avaliacoes.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	@NotNull @NotEmpty
	private String nota;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	
	public Topico converter(CursoRepository cursoRepository) {
		Nota curso = cursoRepository.findByNome(nota);
		return new Topico(titulo, mensagem, curso);
	}

}
