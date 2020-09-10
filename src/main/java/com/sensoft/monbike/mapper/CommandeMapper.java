package com.sensoft.monbike.mapper;

import com.sensoft.monbike.dto.CommandeDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.entities.Commande;
import com.sensoft.monbike.entities.Reparation;
import com.sensoft.monbike.service.ClientServices;
import com.sensoft.monbike.service.CommandeService;
import com.sensoft.monbike.service.ReparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class CommandeMapper {

    @Autowired
    private ClientServices clientServices;

    @Autowired
    private ReparationService commandeService;

    public Commande  toCommande(CommandeDto commandeDto){

        Optional<Client> client = clientServices.findClientById(commandeDto.getClient().getId());

        Optional<Reparation> reparation = commandeService.findReparationById(commandeDto.getReparation().getId());
        Commande commande = new Commande();
        commande.setLibelle(commandeDto.getLibelle());
        commande.setNumeroCommende(generateNumber());
        commande.setDateCommande(LocalDate.now());
        commande.setDatelivraisonprevu(commandeDto.getDatelivraisonprevu());
        commande.setGetDatelivraisonreel(commandeDto.getGetDatelivraisonreel());
        commande.setClient(client.get());
        commande.setReparation(reparation.get());

        return commande;
    }

    public long generateNumber()
    {
        return (long)(Math.random()*100000 + 3333300000L);
    }
}
