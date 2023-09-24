package br.com.Projeto.vendasapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.Projeto.vendasapi.model.Produto;

public class DtoProduto {
	private Long id;
	private String sku;
	private String descricao;
	private String nome;
	private BigDecimal preco;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate cadastro;
	
	
	
	public DtoProduto() {
		super();
		
	}

	public DtoProduto(Long id, String sku, 
			String descricao, String nome, BigDecimal preco,LocalDate cadastro) {
		super();
		this.id = id;
		this.sku = sku;
		this.descricao = descricao;
		this.nome = nome;
		this.preco = preco;
		this.cadastro = cadastro;
	}

	public Produto toModel() {
		return new Produto(id, nome, descricao, preco, sku, cadastro);
	}
	
	public static DtoProduto fromModel( Produto produto) {
		return new DtoProduto(
				produto.getId(),
				produto.getSku(),
				produto.getDescricao(),
				produto.getNome(),
				produto.getPreco(),
				produto.getDataCadastro());
	}
	
	
	public LocalDate getCadastro() {
		return cadastro;
	}

	public void setCadastro(LocalDate cadastro) {
		this.cadastro = cadastro;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
		return "DtoProduto [id=" + id + ", sku=" + sku + ", descricao=" + descricao + ", nome=" + nome + ", preco="
				+ preco + "]";
	}
	
	

}
