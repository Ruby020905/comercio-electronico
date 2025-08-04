package com.ruby.pedidos.productoDTO;

import java.util.Date;

import lombok.Data;

@Data
public class ProductoDto {

    private Long id;
    private String name;
    private String brand;
    private Integer price;
    private Integer quantity;
    private String description;
    private Date date;
    private Boolean stock;
}
