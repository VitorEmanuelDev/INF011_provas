package br.edu.ifba.inf011.aval1.equipamento;

public final class Maquinas extends Equipamento {

	private String descricao;
	private String marca;

	public Maquinas(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.MAQUINAS;
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

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void determinarMarca(String marca) {
		if(this.marca == null) {
			setMarca(marca);
		}	
	}

}
