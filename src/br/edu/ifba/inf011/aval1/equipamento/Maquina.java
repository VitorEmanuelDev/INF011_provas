package br.edu.ifba.inf011.aval1.equipamento;

public final class Maquina extends Equipamento {

	public Maquina(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.MAQUINAS;
	}

}
