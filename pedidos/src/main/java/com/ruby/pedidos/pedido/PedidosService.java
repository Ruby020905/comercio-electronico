package com.ruby.pedidos.pedido;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PedidosService {

       
    private final PedidosRepository pedidosRepository;

    public List<Pedidos> findAll() {
        return pedidosRepository.findAll();
    }

    public Pedidos findById(Long id){
        return pedidosRepository.findById(id).orElse(null);
    }

    public Pedidos save(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

    
     public void delete(Long id){
            pedidosRepository.deleteById(id);
    }
}
