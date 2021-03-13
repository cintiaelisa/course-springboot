package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
