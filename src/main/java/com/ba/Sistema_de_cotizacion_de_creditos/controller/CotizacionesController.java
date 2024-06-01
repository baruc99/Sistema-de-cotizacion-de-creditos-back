package com.ba.Sistema_de_cotizacion_de_creditos.controller;


import com.ba.Sistema_de_cotizacion_de_creditos.entity.Cotizacion;
import com.ba.Sistema_de_cotizacion_de_creditos.service.CotizacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( path = "api/cotizacion")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CotizacionesController {

    @Autowired
    private final CotizacionesService cotizacionesService;

    public CotizacionesController(CotizacionesService cotizacionesService) {
        this.cotizacionesService = cotizacionesService;
    }

    @GetMapping
    public List<Cotizacion> getAll(){
        return cotizacionesService.getCotizaciones();
    }

    @GetMapping("/{cotizacionId}")
    public Optional<Cotizacion> getById(@PathVariable("cotizacionId") Long cotizacionId){
        return cotizacionesService.getCotizacion( cotizacionId );
    }

    @PostMapping
    public Cotizacion saveUpdate(@RequestBody Cotizacion cotizacion){
        cotizacionesService.saveOrUpdateCotizacion( cotizacion );
        return cotizacion;
    }

    @DeleteMapping("{cotizacionId}")
    public void deleteCotizacion(@PathVariable("cotizacionId") Long cotizacionId){
        cotizacionesService.deleteCotizacion( cotizacionId );
    }

}
