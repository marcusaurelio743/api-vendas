package br.com.Projeto.vendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Projeto.vendasapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
