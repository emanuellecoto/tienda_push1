package com.tienda_k.dao;

import com.tienda_k.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao
       extends JpaRepository<Categoria,Long>{
    
}
