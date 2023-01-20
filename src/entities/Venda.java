package entities;

import java.math.BigDecimal;
import java.util.List;

public class Venda {
	private Integer código;
	private List<Produto> itens;
	private BigDecimal valor;
	private BigDecimal comissaoSistema;
	private Empresa empresa;
	private Cliente cliente;

	public Venda(Integer código, List<Produto> itens, Empresa empresa, Cliente cliente) {
		this.código = código;
		this.itens = itens;
		this.empresa = empresa;
		this.cliente = cliente;
	}
	
	public Venda() {
		super();
	}

	public Integer getCódigo() {
		return código;
	}
	
	

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCódigo(Integer código) {
		this.código = código;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = BigDecimal.valueOf(valor);
	}

	public BigDecimal getComissaoSistema() {
		return comissaoSistema;
	}

	public void setComissaoSistema(Double comissaoSistema) {
		this.comissaoSistema = BigDecimal.valueOf(comissaoSistema);
	}
	
	public BigDecimal totalValor() {
		return itens
			.stream()
			.map(item -> item.getPreco())
			.reduce(BigDecimal.ZERO, (preco1, preco2) -> preco1.add(preco2));
	}
	
	public BigDecimal comissaoDoSistema() {
		return totalValor().multiply(empresa.getTaxa());
	}
	
}
