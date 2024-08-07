package com.tienda_k.services.impl;

import com.tienda_k.domain.Producto;
import com.tienda_k.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda_k.dao.ProductoDao;

@Service
public class ProductoServiceImpl
        implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activo) {
        var lista = productoDao.findAll();
        if (activo) {  //Solo activos..
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Producto producto) {
         productoDao.delete(producto);
    }
    
    @Override
    public List<Producto> consulta1(double precioInf, double precioSup){
       return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf,precioSup);
    }

}
