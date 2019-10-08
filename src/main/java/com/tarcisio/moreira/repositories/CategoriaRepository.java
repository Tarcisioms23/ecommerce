package com.tarcisio.moreira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tarcisio.moreira.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
	
	
}
