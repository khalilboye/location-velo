package com.sensoft.monbike.service;

import com.sensoft.monbike.dto.ClientDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.entities.Commande;
import com.sensoft.monbike.mapper.ClientMapper;
import com.sensoft.monbike.mapper.CommandeMapper;
import com.sensoft.monbike.repository.ClientRepository;
import com.sensoft.monbike.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CommandeMapper commandeMapper;

    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    public void save(Commande commande) {
        Optional<Client> client = clientRepository.findById(commande.getClient().getId());
            if(client.isPresent() || client!=null){
                commande.setClient(client.get());
                commandeRepository.save(commande);
            }

    }


}
