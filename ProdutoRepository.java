package com.lojinha.MinhaLojaDeDames.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojinha.MinhaLojaDeDames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	

}
