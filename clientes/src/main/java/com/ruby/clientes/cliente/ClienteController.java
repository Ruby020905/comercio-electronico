package com.ruby.clientes.cliente;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.clientes.pedidoDTO.PedidoDTO;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {

     private final ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable("id") Long id){
        return clienteService.findById(id);
    }

    @PostMapping()
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        clienteService.delete(id);
    }

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Comunicar con el servicio de pedidos
    @GetMapping("/pedido/{id}")
    public PedidoDTO obtenerPedidoPorId(@PathVariable("id") Long id){
        return clienteService.obtenerPedidoPorId(id);
    }
    
}
