
package com.tienda_k.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria {
    
    private static final long SerialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}
