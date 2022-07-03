package br.edu.ifba.inf011.aval1.pessoas;

import br.edu.ifba.inf011.aval1.programa.Programa;

public class Aluno extends Pessoa{

	public Aluno(String nome) {
		super(nome);
	}
	
	Programa programa;

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
}
