package com.ba.Sistema_de_cotizacion_de_creditos.service;


import com.ba.Sistema_de_cotizacion_de_creditos.entity.Plazo;
import com.ba.Sistema_de_cotizacion_de_creditos.repositorio.PlazoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlazoService {

    @Autowired
    PlazoRepository plazoRepository;

    public List<Plazo> getPlazos(){
        return plazoRepository.findAll();
    }

    public Optional<Plazo> getPlazo(Long id){
        return  plazoRepository.findById( id );
    }

    public  void saveOrUpdatePlazo( Plazo plazo ){
        plazoRepository.save(plazo);
    }

    public void delete(Long id ){
        plazoRepository.deleteById( id );
    }
}
