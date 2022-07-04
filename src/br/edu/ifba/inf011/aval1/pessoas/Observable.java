package br.edu.ifba.inf011.aval1.pessoas;

import br.edu.ifba.inf011.aval1.programa.Programa;

public interface Observable {
	public void adicionarInstrutores(Observer observer);
	public void removerInstrutores(Observer observer);
	public void nofificarInstrutores(); 
}
