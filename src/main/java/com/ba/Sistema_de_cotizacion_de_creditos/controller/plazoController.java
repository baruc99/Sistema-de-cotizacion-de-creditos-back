package com.ba.Sistema_de_cotizacion_de_creditos.controller;

import com.ba.Sistema_de_cotizacion_de_creditos.entity.Plazo;
import com.ba.Sistema_de_cotizacion_de_creditos.service.PlazoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( path = "api/plazo")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class plazoController {

    @Autowired
    private final PlazoService plazoService;


    public plazoController(PlazoService plazoService) {
        this.plazoService = plazoService;
    }

    @GetMapping
    public List<Plazo> getAll(){
        return plazoService.getPlazos();
    }

    @GetMapping("/{plazoId}")
    public Optional<Plazo> getById(@PathVariable("plazoId") Long plazoId){
        return plazoService.getPlazo( plazoId );
    }

    @PostMapping
    public Plazo saveUpdate(@RequestBody Plazo plazo){
        plazoService.saveOrUpdatePlazo( plazo );
        return plazo;
    }

    @DeleteMapping("/{plazoId}")
    public void deletePlazo( @PathVariable("plazoId") Long plazoId){
        plazoService.delete( plazoId );
    }
}
