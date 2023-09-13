package br.com.Projeto.vendasapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Projeto.vendasapi.dto.DtoProduto;
import br.com.Projeto.vendasapi.model.Produto;
import br.com.Projeto.vendasapi.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	public DtoProduto salvar( @RequestBody DtoProduto produto) {
		
		Produto entidadeproduto = new Produto(
				produto.getNome(),
				produto.getDescricao(),
				produto.getPreco(), 
				produto.getSku());
		
		repository.save(entidadeproduto);
		
		System.out.println(entidadeproduto);
		
		return produto;
	}

}
