package com.ruby.productos.clienteDTO;

import java.util.Date;

import lombok.Data;

@Data
public class ClienteDTO {

    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private Integer dni;
    private String email;
    private Date date;
    private Boolean account;
}
