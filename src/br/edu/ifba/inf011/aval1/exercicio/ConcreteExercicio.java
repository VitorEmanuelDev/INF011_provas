package br.edu.ifba.inf011.aval1.exercicio;

import java.util.List;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class ConcreteExercicio  implements Exercicio{

	private String nome;
	private List<GruposMuscularesEnum> gruposMusculares;
	private List<ExercicioEnum> tiposExercicios;
	private List<Equipamento> equipamentos;
	private Serie serie;

	public ConcreteExercicio(String nome, List<GruposMuscularesEnum> gruposMusculares,
			List<ExercicioEnum> tiposExercicios, List<Equipamento> equipamentos) {
		this.nome = nome;
		this.gruposMusculares = gruposMusculares;
		this.tiposExercicios = tiposExercicios;
		this.equipamentos = equipamentos;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<GruposMuscularesEnum> getGruposMusculares() {
		return gruposMusculares;
	}

	public void setGruposMusculares(List<GruposMuscularesEnum> gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}


	public List<ExercicioEnum> getTiposExercicios() {
		return tiposExercicios;
	}


	public void setTiposExercicios(List<ExercicioEnum> tiposExercicios) {
		this.tiposExercicios = tiposExercicios;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Programa: ")
		.append(nome);

		if (gruposMusculares != null && !gruposMusculares.isEmpty()) {
			stringBuilder.append(", para os grupos musculares: ");
			for (GruposMuscularesEnum grupoMuscular : gruposMusculares) {
				stringBuilder.append(grupoMuscular);
			}
		}
		if (tiposExercicios != null && !tiposExercicios.isEmpty()) {
			stringBuilder.append(", com os tipos de exercicios: ");
			for (ExercicioEnum exercicio : tiposExercicios) {
				stringBuilder.append(exercicio.name());
				if (exercicio != tiposExercicios.get(tiposExercicios.size() - 1)) {
					stringBuilder.append(", ");
				}
			}
		}
		if (equipamentos != null && !equipamentos.isEmpty()) {
			stringBuilder.append(", utilizando os equipamentos: ");
			for (Equipamento equipamento : equipamentos) {
				stringBuilder.append(equipamento.getIdentificador());
				if (equipamento != equipamentos.get(equipamentos.size() - 1)) {
					stringBuilder.append(", ");
				}
			}
		}
		stringBuilder.append('.');
		
		return stringBuilder.toString();
	}



	@Override
	public void adicionarTipo(ExercicioEnum tipo) {
		// TODO Auto-generated method stub
		
	}

}
