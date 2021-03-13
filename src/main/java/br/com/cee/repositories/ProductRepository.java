package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
