package entities;

import java.math.BigDecimal;

public class Produto {
	private Integer id;
	private String nome;
	private Integer quantidade;
	private BigDecimal preco;
	private Empresa empresa;

	public Produto(Integer id,String nome, Integer quantidade, Double preco, Empresa empresa) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = BigDecimal.valueOf(preco);
		this.empresa = empresa;
	}

	public Produto() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = BigDecimal.valueOf(preco);
	}

}