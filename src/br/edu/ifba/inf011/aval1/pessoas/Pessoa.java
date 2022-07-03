package br.edu.ifba.inf011.aval1.pessoas;

public abstract class Pessoa implements AlunoSubject{
	
	private String nome;
	
	public Pessoa(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
