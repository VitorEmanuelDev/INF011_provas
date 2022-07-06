package br.edu.ifba.inf011.aval1.pessoas;

public interface Observable {
	public void adicionarInstrutor(Observer observer);
	public void removerInstrutor(Observer observer);
	public void nofificarInstrutores(); 
}
