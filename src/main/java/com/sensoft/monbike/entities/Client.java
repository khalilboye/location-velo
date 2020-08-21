package com.sensoft.monbike.entities;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = Client.TABLE_NAME)
public class Client {

    private static final long serialVersionUID = 1505122041950251207L;


    public static final String TABLE_NAME = "CLIENT";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "integer")
    private Long id;

    @Column(name = "CIVILITE")
    private String civilite;

    @NotEmpty()
    @Size(max = 64)
    @Column(name = "NOM")
    private String nom;

    @NotEmpty
    @Size(max = 64)
    @Column(name = "PRENOM")
    private String prenom;

    @NotEmpty
    @Size(max = 128)
    @Column(name = "EMAIL", unique = true, nullable = false)
    @Email
    private String email;

    @Column(name = "STATUT")
    private String statut;

    @Column(name = "LAST_CONNECTION_DAY")
    private Date lastConnectionDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getLastConnectionDay() {
        return lastConnectionDay;
    }

    public void setLastConnectionDay(Date lastConnectionDay) {
        this.lastConnectionDay = lastConnectionDay;
    }
}
