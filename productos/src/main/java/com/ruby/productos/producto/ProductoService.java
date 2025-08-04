package com.ruby.productos.producto;


import java.util.List;

import org.springframework.stereotype.Service;

import com.ruby.productos.clienteDTO.ClienteDTO;
import com.ruby.productos.clienteDTO.ClienteFeingApi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoService {

       
    private final ProductoRepository productoRepository;
    private final ClienteFeingApi clienteFeingApi;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(Long id){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

     public void delete(Long id){
            productoRepository.deleteById(id);
    }

    //Comunicar con el servicio Cliente
    public ClienteDTO obtenerClientePorId(Long id){
        return clienteFeingApi.buscarClientePorId(id);
    }
}
