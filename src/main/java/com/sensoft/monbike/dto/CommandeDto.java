package com.sensoft.monbike.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class CommandeDto {

    private  Long id;
    private String libelle;
    private Long numeroCommende ;
    private LocalDate dateCommande;
    private LocalDate datelivraisonprevu;
    private LocalDate getDatelivraisonreel;
    private ClientDto clientDto;
    private Set<ReparationDto> reparationDtos;


    public CommandeDto() {
    }

    public Long getNumeroCommende() {
        return numeroCommende;
    }

    public void setNumeroCommende(Long numeroCommende) {
        this.numeroCommende = numeroCommende;
    }

    public ClientDto getClientDto() {
        return clientDto;
    }

    public void setClientDto(ClientDto clientDto) {
        this.clientDto = clientDto;
    }

    public Set<ReparationDto> getReparationDtos() {
        return reparationDtos;
    }

    public void setReparationDtos(Set<ReparationDto> reparationDtos) {
        this.reparationDtos = reparationDtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public LocalDate getDatelivraisonprevu() {
        return datelivraisonprevu;
    }

    public void setDatelivraisonprevu(LocalDate datelivraisonprevu) {
        this.datelivraisonprevu = datelivraisonprevu;
    }

    public LocalDate getGetDatelivraisonreel() {
        return getDatelivraisonreel;
    }

    public void setGetDatelivraisonreel(LocalDate getDatelivraisonreel) {
        this.getDatelivraisonreel = getDatelivraisonreel;
    }
}
