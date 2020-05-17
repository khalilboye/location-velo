package com.sensoft.monbike.repository;

import com.sensoft.monbike.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}

