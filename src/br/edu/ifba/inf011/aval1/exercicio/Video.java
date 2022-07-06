package br.edu.ifba.inf011.aval1.exercicio;

public class Video{

	private ExercicioEnum tipo;
	private String descricao;
	
	public Video(ExercicioEnum tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
