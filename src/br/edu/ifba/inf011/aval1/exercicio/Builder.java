package br.edu.ifba.inf011.aval1.exercicio;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public class Builder {

	private String nome;
	private List<GruposMuscularesEnum> gruposMusculares  = new ArrayList<>();
	private List<ExercicioEnum> tiposExercicios = new ArrayList<>();
	private List<Equipamento> equipamentos  = new ArrayList<>();

	//List<String> gruposMuscularesList = Stream.of(GruposMuscularesEnum.values())
//			.map(GruposMuscularesEnum::name)
//			.collect(Collectors.toList());

	//essa lista abaixo nao faz sentido...
	//List<ExercicioEnum> tiposExerciciosList = Arrays.asList(ExercicioEnum.values()); 

	public Builder(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome não pode ser null");
		}
		this.nome = nome;
	}

	public Builder comGruposMusculares(GruposMuscularesEnum grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
		return this;
	}

	public Builder comTipoExercicio(ExercicioEnum tipoExercicio) {
		this.tiposExercicios.add(tipoExercicio);
		return this;
	}

	public Builder comEquipamento(Equipamento novoEquipamento) {
		this.equipamentos.add(novoEquipamento);
		return this;
	}

	public Exercicio build() {
		return new Exercicio(this);
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
