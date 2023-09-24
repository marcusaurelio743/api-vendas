package br.com.Projeto.vendasapi.rest;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Projeto.vendasapi.dto.DtoProduto;
import br.com.Projeto.vendasapi.model.Produto;
import br.com.Projeto.vendasapi.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	
	/* verbo Get usado para pegar  dados da aplicação nesse exemplo serão todos os produtos*/
	@GetMapping
	
	public List<DtoProduto> listarProdutos(){
		return repository.findAll().stream().map(p -> DtoProduto.fromModel(p))
				.collect(Collectors.toList());
	}
	
	
	/* verbo Post usado para salvar os dados da aplicação*/
	@PostMapping
	public DtoProduto salvar( @RequestBody DtoProduto produto) {
		
		Produto entidadeproduto = produto.toModel();
		
		
		entidadeproduto =  repository.save(entidadeproduto);
		
		
		
		return DtoProduto.fromModel(entidadeproduto);
	}
	
	/* verbo Put usado para atualizar os dados da aplicação, passando paramentro nesse exemplo
	 * o Paramentro passado é o ID*/
	@PutMapping("{id}")
	public ResponseEntity<Void> atualizar( @PathVariable Long id, @RequestBody DtoProduto produto) {
		
		Optional<Produto> produtoExistente =  repository.findById(id);
		
		if(produtoExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Produto entidade = produto.toModel();
		entidade.setId(id);
		
		repository.save(entidade);
		
		return ResponseEntity.ok().build();
		
	}

}
