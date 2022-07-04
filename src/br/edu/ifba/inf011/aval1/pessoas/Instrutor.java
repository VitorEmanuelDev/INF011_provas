package br.edu.ifba.inf011.aval1.pessoas;

import java.time.LocalDateTime;
import java.util.List;


public class Instrutor implements Observer {

	private String nome;
	
	public Instrutor(String nome) {
		this.nome = nome;
	}
	
	List<Aluno> listaAlunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	@Override
	public void atualizar(Aluno aluno) {
		LocalDateTime now = LocalDateTime.now();
		if(aluno.getPrograma().getListaSeries().size() == 0) {
			System.out.println("O Aluno " + aluno.getNome() + 
					" concluiu o programa " + aluno.getPrograma().getTipo() +
					" às " + now);
		}
	}

	
}
