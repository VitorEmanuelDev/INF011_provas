package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {

	private String identificador;
	private int quantidade;
	private String descricao;
	private double peso;
	private String marca;

	public Equipamento(String identificador, int quantidade) {
		this.identificador = identificador;
		this.atualizaQuantidade(quantidade);
	}


	public abstract EquipamentoEnum getEquipamento();

	public String getIdentificador() {
		return this.identificador;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Descricao não pode ser nula ou vazia");
		}
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void atualizaQuantidade(int quantidade) {
		if ((quantidade < 0 && (this.quantidade + quantidade) <= 0)) {
			throw new IllegalArgumentException("Quantidade do equipamento não pode ser menor que 0");
		}

		this.quantidade += quantidade;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Peso não pode ser zero ou um número negativo");
		}
		this.peso = peso;
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
