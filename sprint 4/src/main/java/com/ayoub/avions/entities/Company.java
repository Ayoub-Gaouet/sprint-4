package com.ayoub.avions.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCom;
    private String nomCom;
    private String descriptionCom;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Avion> avions;
    public Company() {}
    public Company(String nomCom , String descriptionCom , List<Avion> avions)
    {
        super();
        this.nomCom = nomCom ;
        this.descriptionCom = descriptionCom ;
        this.avions = avions;
    }
    public Long getIdCom () {
        return idCom;
    }
    public void setIdCom (Long idCom ) {
        this.idCom = idCom ;
    }
    public String getNomCom () {
        return nomCom ;
    }
    public void setNomCom (String nomCom ) {
        this.nomCom  = nomCom ;
    }
    public String getDescriptionCom () {
        return descriptionCom ;
    }
    public void setDescriptionCom (String descriptionCom ) {
        this.descriptionCom = descriptionCom ;
    }
    public List<Avion> getAvions() {
        return avions;
    }
    public void setAvions(List<Avion> avions) {
        this.avions = avions;
    }
}