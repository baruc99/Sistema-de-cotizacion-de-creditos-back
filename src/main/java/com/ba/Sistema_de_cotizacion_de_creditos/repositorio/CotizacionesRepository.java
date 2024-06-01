package com.ba.Sistema_de_cotizacion_de_creditos.repositorio;


import com.ba.Sistema_de_cotizacion_de_creditos.entity.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotizacionesRepository extends JpaRepository<Cotizacion, Long> {
}
