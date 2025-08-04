package com.ruby.pedidos.pedido;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruby.pedidos.productoDTO.ProductoDto;
import com.ruby.pedidos.productoDTO.ProductoFeingApi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PedidosService {

       
    private final PedidosRepository pedidosRepository;
    private final ProductoFeingApi productoFeingApi;

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

    //comunicacion con productos
    public ProductoDto obtenerProductoPorId(Long id){
        return productoFeingApi.buscarProductoPorId(id);
    }
}
