package br.edu.ifba.inf011.aval1.exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;
import br.edu.ifba.inf011.aval1.factory.EquipamentoFactory;

public class Builder {

	private String nome;
	private String grupoMuscular;
	private ExercicioEnum tipoExercicio;
	private Equipamento equipamento;
	private EquipamentoFactory factory;


	List<String> gruposMuscularesList = Stream.of(GruposMuscularesEnum.values())
			.map(GruposMuscularesEnum::name)
			.collect(Collectors.toList());

	List<ExercicioEnum> tiposExerciciosList = Arrays.asList(ExercicioEnum.values()); 

	public Builder(String nome, EquipamentoFactory factory) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome não pode ser null");
		}
		if (factory == null) {
			throw new IllegalArgumentException("Factory não pode ser null");
		}
		this.nome = nome;
		this.factory = factory;
	}

	public Builder comGruposMusculares(String grupoMuscular) {

		if(gruposMuscularesList.contains(grupoMuscular.toUpperCase())) {
			this.setGrupoMuscular(grupoMuscular.toUpperCase());
		}

		return this;
	}

	private void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;	
	}

	public Builder comTipoExercicio(ExercicioEnum tipoExercicio) {
		if(tiposExerciciosList.contains(tipoExercicio)) {
			this.setTipoExercicio(tipoExercicio);
		}
		return this;
	}

	private void setTipoExercicio(ExercicioEnum tipoExercicio) {
		this.tipoExercicio = tipoExercicio;	
	}

	public Builder comEquipamento(EquipamentoEnum tipoEquipamento, String identificador) {

		if(EquipamentoEnum.ACESSORIOS.equals(tipoEquipamento)){
			equipamento = factory.getAcessorios().get(identificador);
		}
		if(EquipamentoEnum.MAQUINAS.equals(tipoEquipamento)){
			equipamento = factory.getMaquinas().get(identificador);
		}
		if(EquipamentoEnum.HALTERES.equals(tipoEquipamento)){
			equipamento = factory.getHalteres().get(identificador);
		}
		this.setEquipamento(equipamento);
		return this;
	}

	private void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;	
	}

	public Exercicio build() {
		return new Exercicio(this);
	}

	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public ExercicioEnum getTipoExercicio() {
		return tipoExercicio;
	}

	public String getNome() {
		return nome;
	}

	public Equipamento getEquipamento() {
		return equipamento;	
	}

}
