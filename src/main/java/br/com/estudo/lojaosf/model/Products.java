package br.com.estudo.lojaosf.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "model_year", nullable = false)
    private Double model_year;

    @Column(name = "price", nullable = false)
    private Double price;

}