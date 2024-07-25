
package com.tienda_k.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {
    
    private static final long SerialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}
