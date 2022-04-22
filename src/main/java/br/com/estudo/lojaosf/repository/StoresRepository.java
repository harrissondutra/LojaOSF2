package br.com.estudo.lojaosf.repository;

import br.com.estudo.lojaosf.model.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoresRepository extends JpaRepository<Stores, Integer> {
}