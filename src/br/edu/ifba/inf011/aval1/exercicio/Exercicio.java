package br.edu.ifba.inf011.aval1.exercicio;

import java.util.List;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public final class Exercicio {

	private String nome;
	private List<GruposMuscularesEnum> gruposMusculares;
	private List<ExercicioEnum> tiposExercicios;
	private List<Equipamento> equipamentos;

	public Exercicio(Builder builder) {
		this.nome = builder.getNome();
		this.gruposMusculares = builder.getGruposMusculares();
		this.tiposExercicios = builder.getTiposExercicios();
		this.equipamentos = builder.getEquipamentos();
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