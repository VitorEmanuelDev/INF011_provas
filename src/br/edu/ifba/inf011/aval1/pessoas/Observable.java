package br.edu.ifba.inf011.aval1.pessoas;

public interface Observable {
	public void adicionarInstrutores(Observer observer);
	public void removerInstrutores(Observer observer);
	public void nofificarInstrutores(); 
}
