package com.ruby.productos.producto;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.productos.clienteDTO.ClienteDTO;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoController {

    
     private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos(){
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable("id") Long id){
        return productoService.findById(id);
    }

    @PostMapping()
    public Producto createProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        productoService.delete(id);
    }

    //Cominicar con cliente
    @GetMapping("/cliente/{id}")
    public ClienteDTO obtenerClientePorId(@PathVariable("id") Long id){
        return productoService.obtenerClientePorId(id);
    }


}
