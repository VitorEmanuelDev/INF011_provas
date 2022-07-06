package br.edu.ifba.inf011.aval1.equipamento;

public final class Acessorio extends Equipamento {


	public Acessorio(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.ACESSORIOS;
	}

}
