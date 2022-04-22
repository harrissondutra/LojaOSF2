package br.com.estudo.lojaosf.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StoresDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private final String name;
    private final String phone;
    private final String email;
}
