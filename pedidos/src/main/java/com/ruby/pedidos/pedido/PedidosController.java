package com.ruby.pedidos.pedido;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pedidos")
@AllArgsConstructor
public class PedidosController {

    private PedidosService pedidosService;

    @GetMapping
    public List<Pedidos> getAllPedidoss(){
        return pedidosService.findAll();
    }

    @GetMapping("/{id}")
    public Pedidos getPedidosById(@PathVariable("id") Long id){
        return pedidosService.findById(id);
    }

    @PostMapping()
    public Pedidos createPedidos(@RequestBody Pedidos pedidos){
        return pedidosService.save(pedidos);
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        pedidosService.delete(id);
    }
}
