package com.ruby.productos.clienteDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENTES")
public interface ClienteFeingApi {

    @GetMapping("/clientes/{id}")
    ClienteDTO buscarClientePorId(@PathVariable("id") Long id);
}
