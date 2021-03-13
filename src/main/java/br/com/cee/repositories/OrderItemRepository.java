package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
