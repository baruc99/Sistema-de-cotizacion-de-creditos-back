package com.ba.Sistema_de_cotizacion_de_creditos.controller;

import com.ba.Sistema_de_cotizacion_de_creditos.entity.Producto;
import com.ba.Sistema_de_cotizacion_de_creditos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( path = "api/producto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class productoController {

    @Autowired
    private final ProductoService productoService;

    public productoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAll(){
        return productoService.getProductos();
    }

    @GetMapping("/{productoId}")
    public Optional<Producto> getById(@PathVariable("productoId") Long productoId){
        return productoService.getProducto( productoId );
    }

    @PostMapping
    public Producto saveUpdate(@RequestBody Producto producto){
        productoService.saveOrUpdateProducto( producto );
        return producto;
    }

    @DeleteMapping("/{productoId}")
    public void deleteProducto(@PathVariable("productoId") Long productoId){
        productoService.deleteProducto( productoId );
    }
}
