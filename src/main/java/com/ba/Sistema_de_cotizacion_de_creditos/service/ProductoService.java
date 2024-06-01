package com.ba.Sistema_de_cotizacion_de_creditos.service;

import com.ba.Sistema_de_cotizacion_de_creditos.entity.Producto;
import  com.ba.Sistema_de_cotizacion_de_creditos.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;


    public List<Producto> getProductos(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getProducto(Long id ){
        return productoRepository.findById( id );
    }

    public void saveOrUpdateProducto( Producto producto ){
        productoRepository.save(producto);
    }

    public void deleteProducto( Long id ){
        productoRepository.deleteById( id );
    }


}
