package br.edu.ifba.inf011.aval1.exercicio;

import java.util.List;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.programa.Serie;

public abstract class AbstractExercicio {

	private static String nome;
	private static List<GruposMuscularesEnum> gruposMusculares;
	private static List<ExercicioEnum> tiposExercicios;
	private static List<Equipamento> equipamentos;
	private static Serie serie;

	public AbstractExercicio(String nome, List<GruposMuscularesEnum> gruposMusculares,
			List<ExercicioEnum> tiposExercicios, List<Equipamento> equipamentos) {
		AbstractExercicio.nome = nome;
		AbstractExercicio.gruposMusculares = gruposMusculares;
		AbstractExercicio.tiposExercicios = tiposExercicios;
		AbstractExercicio.equipamentos = equipamentos;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		AbstractExercicio.nome = nome;
	}

	public static List<GruposMuscularesEnum> getGruposMusculares() {
		return gruposMusculares;
	}

	public void setGruposMusculares(List<GruposMuscularesEnum> gruposMusculares) {
		AbstractExercicio.gruposMusculares = gruposMusculares;
	}


	public static List<ExercicioEnum> getTiposExercicios() {
		return tiposExercicios;
	}


	public void setTiposExercicios(List<ExercicioEnum> tiposExercicios) {
		AbstractExercicio.tiposExercicios = tiposExercicios;
	}

	public  static List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		AbstractExercicio.equipamentos = equipamentos;
	}

	public static Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		AbstractExercicio.serie = serie;
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

}
