package br.edu.ifba.inf011.aval1.equipamento;

public final class Acessorio extends Equipamento {

	private String descricao;

	public Acessorio(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.ACESSORIOS;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Descricao não pode ser nula ou vazia");
		}
		this.descricao = descricao;
	}
}
