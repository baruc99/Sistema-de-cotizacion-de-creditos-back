package com.ba.Sistema_de_cotizacion_de_creditos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "cotizaciones")
public class Cotizacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  int id_cotizacion;

    @ManyToOne
    @JoinColumn(name = "id_producto") // Nombre de la columna FK en la tabla cotizaciones
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_plazo") // Nombre de la columna FK en la tabla cotizaciones
    private Plazo plazo;

    private double abono_normal;
    private double abono_puntual;
}


