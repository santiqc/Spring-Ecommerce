package com.api.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orden {

    private Long id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private Double total;

}
