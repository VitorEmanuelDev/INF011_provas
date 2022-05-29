package br.edu.ifba.inf011.aval1.equipamento;

public final class Maquina extends Equipamento {

	private String descricao;
	private String marca;

	public Maquina(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.MAQUINAS;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca não pode ser nula ou vazia");
		}
		this.marca = marca;
	}
}
