package com.tienda_k.services;

import com.tienda_k.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se recupera la lista de categorias de
    //la tabla categoria dentro de un ArrayList
    //Solo las activas o todas...
    
    public List<Categoria> getCategorias(boolean activo);
}
