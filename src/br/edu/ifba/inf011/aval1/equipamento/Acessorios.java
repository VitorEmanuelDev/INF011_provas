package br.edu.ifba.inf011.aval1.equipamento;

public final class Acessorios extends Equipamento {

	private String descricao;
	
	public Acessorios(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.ACESSORIOS;
	}

	public String getDescricao() {
		return descricao;
	}

	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void criarDescricao(String descricao) {
		setDescricao(descricao);
	}

}
