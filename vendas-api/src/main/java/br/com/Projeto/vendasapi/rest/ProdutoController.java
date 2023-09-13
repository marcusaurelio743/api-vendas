package br.com.Projeto.vendasapi.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Projeto.vendasapi.dto.DtoProduto;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@PostMapping
	public DtoProduto salvar( @RequestBody DtoProduto produto) {
		
		System.out.println(produto);
		
		return produto;
	}

}
