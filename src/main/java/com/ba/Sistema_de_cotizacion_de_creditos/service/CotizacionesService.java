package com.ba.Sistema_de_cotizacion_de_creditos.service;


import com.ba.Sistema_de_cotizacion_de_creditos.entity.Cotizacion;
import com.ba.Sistema_de_cotizacion_de_creditos.repositorio.CotizacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CotizacionesService {
    @Autowired
    CotizacionesRepository cotizacionesRepository;

    public List<Cotizacion> getCotizaciones(){
        return cotizacionesRepository.findAll();
    }

    public Optional<Cotizacion> getCotizacion( long id ){
        return cotizacionesRepository.findById( id );
    }

    public void saveOrUpdateCotizacion( Cotizacion cotizacion){
        cotizacionesRepository.save( cotizacion );
    }

    public void deleteCotizacion( Long id ){
        cotizacionesRepository.deleteById( id );
    }
}
