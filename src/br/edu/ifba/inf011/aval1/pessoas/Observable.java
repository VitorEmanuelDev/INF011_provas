package br.edu.ifba.inf011.aval1.pessoas;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<Observer> listObservers = new ArrayList<>();

	public void adicionaObserver(Observer observer) {
		listObservers.add(observer);
	}

	public void removeObserver(Observer observer) {
		listObservers.remove(observer);
	}

	protected void nofifica() {
		listObservers.forEach(observer -> observer.atualizar(this));
	}
}
