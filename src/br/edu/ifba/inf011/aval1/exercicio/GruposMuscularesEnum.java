package br.edu.ifba.inf011.aval1.exercicio;

public enum GruposMuscularesEnum {
	A("TREINO A: PEITO + BÍCEPS"),
	B("TREINO B: COSTAS + TRICEPS"),
	C("TREINO C: LOMBAR + ANTEBRAÇOS + ABDÔMEN"),
	D("TREINO D: OMBROS + TRAPÉZIO"),
	E("TREINO E: BÍCEPS FEMORAL + QUADRICEPS + PANTURILHA");

	public final String grupoMuscular;

	GruposMuscularesEnum(String gruposMusculares) {
		this.grupoMuscular = gruposMusculares;
	}

}
