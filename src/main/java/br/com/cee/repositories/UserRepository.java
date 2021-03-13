package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
