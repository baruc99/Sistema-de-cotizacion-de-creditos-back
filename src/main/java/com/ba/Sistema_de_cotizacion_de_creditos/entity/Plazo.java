package com.ba.Sistema_de_cotizacion_de_creditos.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "plazos")
public class Plazo {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id_plazo;

    private int semanas;
    private double tasa_normal;
    private  double tasa_puntual;
}



