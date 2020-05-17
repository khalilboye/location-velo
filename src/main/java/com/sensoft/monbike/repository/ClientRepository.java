package com.sensoft.monbike.repository;

import com.sensoft.monbike.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findClientByTel(String tel);
}
