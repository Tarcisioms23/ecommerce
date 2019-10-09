package com.tarcisio.moreira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tarcisio.moreira.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>  {
	
	
}
