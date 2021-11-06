package com.lojinha.MinhaLojaDeDames.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojinha.MinhaLojaDeDames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{

}
