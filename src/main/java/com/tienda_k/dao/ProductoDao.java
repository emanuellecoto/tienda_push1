package com.tienda_k.dao;

import com.tienda_k.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao
       extends JpaRepository<Producto,Long>{
    
    
    //Retorna la lista de productos que tienen un rango de precios 
    public List<Producto>
            findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
            
    
}
