package br.com.Projeto.vendasapi.dto;

import java.math.BigDecimal;

public class DtoProduto {
	private String sku;
	private String descricao;
	private String nome;
	private BigDecimal preco;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "DtoProduto [sku=" + sku + ", descricao=" + descricao + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	

}
