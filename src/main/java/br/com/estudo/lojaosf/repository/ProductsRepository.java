package br.com.estudo.lojaosf.repository;

import br.com.estudo.lojaosf.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}