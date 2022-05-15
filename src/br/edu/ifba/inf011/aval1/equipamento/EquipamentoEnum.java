package br.edu.ifba.inf011.aval1.equipamento;

public enum EquipamentoEnum {

	MAQUINAS("br.edu.ifba.inf011.aval1.equipamento.Maquinas"),
	HALTERES("br.edu.ifba.inf011.aval1.equipamento.Halteres"),
	ACESSORIOS("br.edu.ifba.inf011.aval1.equipamento.Acessorios"),
	NENHUM("");

	public final String classe;

	EquipamentoEnum(String classe) {
		this.classe = classe;
	}

}
