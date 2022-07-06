package br.edu.ifba.inf011.aval1.exercicio;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class ExercicioBuilder {

	private String nome;
	private List<GruposMuscularesEnum> gruposMusculares;
	private List<ExercicioEnum> tiposExercicios;
	private List<Equipamento> equipamentos;
	private Serie serie;

	public ExercicioBuilder() {}
	
	public ExercicioBuilder reset(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome não pode ser null");
		}
		this.nome = nome;
		this.gruposMusculares  = new ArrayList<>();
		this.tiposExercicios = new ArrayList<>();
		this.equipamentos  = new ArrayList<>();
		this.serie = null;
		return this;
	}
	
	public ExercicioBuilder reset() {
		this.nome = null;
		this.gruposMusculares  = new ArrayList<>();
		this.tiposExercicios = new ArrayList<>();
		this.equipamentos  = new ArrayList<>();
		this.serie = null;
		return this;
	}

	public ExercicioBuilder comGruposMusculares(GruposMuscularesEnum grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
		return this;
	}

	public ExercicioBuilder comTipoExercicio(ExercicioEnum tipoExercicio) {
		this.tiposExercicios.add(tipoExercicio);
		return this;
	}


	public ExercicioBuilder comEquipamento(Equipamento novoEquipamento) {
		this.equipamentos.add(novoEquipamento);
		return this;
	}

	public ExercicioBase build() {
		return new ExercicioBase(this.nome, this.gruposMusculares, this.tiposExercicios, this.equipamentos, this.serie);
	}

	public List<GruposMuscularesEnum> getGruposMusculares() {
		return gruposMusculares;
	}

	public List<ExercicioEnum> getTiposExercicios() {
		return tiposExercicios;
	}

	public String getNome() {
		return nome;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public void getSerie(Serie serie) {
		this.serie = serie;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

}
