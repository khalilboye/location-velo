package com.sensoft.monbike.service;

import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.entities.Commande;
import com.sensoft.monbike.entities.Reparation;
import com.sensoft.monbike.mapper.CommandeMapper;
import com.sensoft.monbike.repository.ClientRepository;
import com.sensoft.monbike.repository.CommandeRepository;
import com.sensoft.monbike.repository.ReparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReparationService {

    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ReparationRepository  reparationRepository;


    public List<Reparation> findAll() {
        return reparationRepository.findAll();
    }

    public void save(Reparation reparation) {

        reparationRepository.save(reparation);
    }


}
