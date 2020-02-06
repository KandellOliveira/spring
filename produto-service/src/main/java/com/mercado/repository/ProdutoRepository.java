/**
 * 
 */
package com.mercado.repository;

import com.mercado.domain.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	Produto findByProdutoId(Integer produtoId);
	
}
