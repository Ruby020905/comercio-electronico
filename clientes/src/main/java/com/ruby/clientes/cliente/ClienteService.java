package com.ruby.clientes.cliente;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruby.clientes.pedidoDTO.PedidoDTO;
import com.ruby.clientes.pedidoDTO.PedidoFeingApi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {

       
    private final ClienteRepository clienteRepository;
    private final PedidoFeingApi pedidoFeingApi;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

     public void delete(Long id){
            clienteRepository.deleteById(id);
        }

    //comunicR CON PEDIDOS
    public PedidoDTO obtenerPedidoPorId(Long id){
        return pedidoFeingApi.buscarPedidoPorId(id);
    }
}
