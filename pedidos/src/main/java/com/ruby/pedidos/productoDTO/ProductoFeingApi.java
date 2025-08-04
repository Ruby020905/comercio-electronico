package com.ruby.pedidos.productoDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="PRODUCTOS")
public interface ProductoFeingApi {

    @GetMapping("/productos/{id}")
    ProductoDto buscarProductoPorId(@PathVariable("id") Long id);

}
