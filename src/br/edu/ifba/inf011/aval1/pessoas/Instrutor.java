package br.edu.ifba.inf011.aval1.pessoas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instrutor implements Observer {

	private String nome;
	
	public Instrutor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void atualizar(Aluno aluno) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		if(aluno.getPrograma().getListaSeries().size() == 0) {
			System.out.println("O Aluno " + aluno.getNome() + 
					" concluiu o programa " + aluno.getPrograma().getTipo() +
					". Horário " + now.format(formatter));
		}
	}
	
}
