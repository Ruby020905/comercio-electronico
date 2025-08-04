package com.ruby.clientes.pedidoDTO;

import java.util.Date;

import lombok.Data;

@Data
public class PedidoDTO {

    private Long id;
    private String name;
    private String notify;
    private Integer total_products;
    private Integer quantity_products;
    private String details;
    private Date date;
    private Boolean delivery;
}
