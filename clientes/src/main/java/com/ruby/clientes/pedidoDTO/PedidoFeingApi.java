package com.ruby.clientes.pedidoDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="PEDIDOS")
public interface PedidoFeingApi {
    @GetMapping("/pedidos/{id}")
    PedidoDTO buscarPedidoPorId(@PathVariable("id") Long id);
}
