package com.api.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

  
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrden {
    private Long id;
    private String nombre;
    private Double cantidad;
    private Double precio;
    private Double total;
}
