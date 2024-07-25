package com.tienda_k.dao;

import com.tienda_k.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao
       extends JpaRepository<Producto,Long>{
    
}
