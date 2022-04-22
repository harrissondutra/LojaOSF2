package br.com.estudo.lojaosf.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
}
