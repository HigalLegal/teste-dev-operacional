package entities;

import java.math.BigDecimal;

public class Empresa {
	private Integer id;
	private String nome;
	private String cnpj;
	private BigDecimal taxa;
	private BigDecimal saldo;

	public Empresa() {
		super();
	}

	public Empresa(Integer id, String nome, String cnpj, Double taxa, Double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.taxa = BigDecimal.valueOf(taxa);
		this.saldo = BigDecimal.valueOf(saldo);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = BigDecimal.valueOf(taxa);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " || CNPJ: " + cnpj + " || Saldo: " + saldo;
	}

}
