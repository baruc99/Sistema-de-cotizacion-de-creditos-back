package com.ba.Sistema_de_cotizacion_de_creditos.repositorio;


import com.ba.Sistema_de_cotizacion_de_creditos.entity.Plazo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlazoRepository extends JpaRepository<Plazo, Long> {
}
