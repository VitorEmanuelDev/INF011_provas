package br.edu.ifba.inf011.aval1.pessoas;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.programa.Programa;
import br.edu.ifba.inf011.aval1.programa.ProgramaEnum;

public class Aluno implements Observable{

	private String nome;
	private List<Observer> listObservers = new ArrayList<>();

	public Aluno(String nome) {
		this.nome = nome;
	}

	Programa programa;

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void removerSerieRealizada() {
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = now.getDayOfWeek();  
		this.getPrograma().getListaSeries().forEach(serie -> {
			if(programa.getTipo().equals(ProgramaEnum.Cardio) || programa.getTipo().equals(ProgramaEnum.FullBody)) {
				if(day.equals(DayOfWeek.MONDAY) || day.equals(DayOfWeek.WEDNESDAY) || day.equals(DayOfWeek.FRIDAY)){
					serie.setRealizada();				
				}
			}
			if(programa.getTipo().equals(ProgramaEnum.ABCD)) {
				if(day.equals(DayOfWeek.MONDAY) || day.equals(DayOfWeek.TUESDAY) || day.equals(DayOfWeek.WEDNESDAY) || day.equals(DayOfWeek.THURSDAY)){
					serie.setRealizada();	
				}
			}
		});
		this.nofificarInstrutores();
	}

	@Override
	public void adicionarInstrutores(Observer observer) {
		listObservers.add(observer);
	}

	@Override
	public void removerInstrutores(Observer observer) {
		listObservers.remove(observer);
	}

	@Override
	public void nofificarInstrutores() {
		listObservers.forEach(observer -> observer.atualizar(this));
	}
}
