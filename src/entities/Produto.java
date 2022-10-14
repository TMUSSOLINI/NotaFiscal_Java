package entities;

public class Produto {
	private String nome;
	private String marca;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {
	}


	public Produto(String nome, String marca, Double preco, Integer quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Double getPreco() {
		return preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
