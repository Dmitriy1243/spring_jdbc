package com.example.spring_jdbc.repositories;

import com.example.spring_jdbc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByName(String title);
}
