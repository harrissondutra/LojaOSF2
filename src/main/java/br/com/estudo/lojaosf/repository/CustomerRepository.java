package br.com.estudo.lojaosf.repository;

import br.com.estudo.lojaosf.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}