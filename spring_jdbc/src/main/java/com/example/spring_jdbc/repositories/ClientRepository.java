package com.example.spring_jdbc.repositories;

import com.example.spring_jdbc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByName(String name);
    List<Client> findById(long id);
}
