package br.edu.ifba.inf011.aval1.exercicio;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public class ExercicioBuilder {

	private String nome;
	private List<GruposMuscularesEnum> gruposMusculares;
	private List<ExercicioEnum> tiposExercicios;
	private List<Equipamento> equipamentos;

	public ExercicioBuilder() {}
	
	public ExercicioBuilder reset(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome não pode ser null");
		}
		this.nome = nome;
		this.gruposMusculares  = new ArrayList<>();
		this.tiposExercicios = new ArrayList<>();
		this.equipamentos  = new ArrayList<>();
		return this;
	}
	
	public ExercicioBuilder reset() {
		this.nome = null;
		this.gruposMusculares  = new ArrayList<>();
		this.tiposExercicios = new ArrayList<>();
		this.equipamentos  = new ArrayList<>();
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

	public Exercicio build() {
		return new Exercicio(this.nome, this.gruposMusculares, this.tiposExercicios, this.equipamentos);
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

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

}
