package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {

	private String identificador;
	private int quantidade;

	public Equipamento(String identificador, int quantidade) {
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
	}

	abstract EquipamentoEnum getEquipamento();

	public String getIdentificador() {
		return identificador;
	}

	public int getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void adicionarEquipamento(int quantidade) {
		if(quantidade > 0 && quantidade < 200) {
			int novaQuantidade = getQuantidade() + quantidade;
			this.setQuantidade(novaQuantidade);
		}
	}
	
	public void retirarEquipamento(int quantidade) {
		
		if(quantidade < 0) {
			quantidade = quantidade * -1;
		}	
		if(getQuantidade() - quantidade < 0) {
			quantidade = 0;
		}
			int novaQuantidade = getQuantidade() - quantidade;
			this.setQuantidade(novaQuantidade);
	}

	private void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
