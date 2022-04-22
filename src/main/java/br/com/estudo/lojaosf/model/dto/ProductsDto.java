package br.com.estudo.lojaosf.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String name;
    private final String brand;
    private final String category;
    private final Double model_year;
    private final Double price;
}
