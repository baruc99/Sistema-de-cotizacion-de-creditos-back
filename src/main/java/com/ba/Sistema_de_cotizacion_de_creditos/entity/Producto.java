package com.ba.Sistema_de_cotizacion_de_creditos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;

    private String sku;
    private String nombre;
    private String descripcion;
    private Double precio;
}
