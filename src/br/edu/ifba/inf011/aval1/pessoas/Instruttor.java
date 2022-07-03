package br.edu.ifba.inf011.aval1.pessoas;

import java.net.http.WebSocket.Listener;
import java.util.List;

public class Instruttor extends Pessoa implements InstrutorListener {

	public Instruttor(String nome) {
		super(nome);
	}
	
	List<Aluno> listaAlunos;

}
