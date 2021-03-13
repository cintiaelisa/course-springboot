package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
