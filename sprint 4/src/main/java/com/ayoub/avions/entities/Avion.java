package com.ayoub.avions.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvion;
    @NotNull
    @Size (min = 4,max = 15)
    private String nomAvion;
    @Min(value = 10)
    @Max(value = 10000)
    private Double prixAvion;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date dateCreation;
    @ManyToOne
    private Company company;
    public Avion() {
        super();
    }
    public Avion(String nomAvion, Double prixAvion, Date dateCreation) {
        super();
        this.nomAvion = nomAvion;
        this.prixAvion = prixAvion;
        this.dateCreation = dateCreation;
    }
    public Long getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(Long idAvion) {
        this.idAvion = idAvion;
    }
    public String getNomAvion() {
        return nomAvion;
    }
    public void setNomAvion(String nomAvion) {
        this.nomAvion = nomAvion;
    }
    public Double getPrixAvion() {
        return prixAvion;
    }
    public void setPrixAvion(Double prixAvion) {
        this.prixAvion = prixAvion;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    @Override
    public String toString() {
        return "Avion [idAvion=" + idAvion + ", nomAvion=" +
                nomAvion + ", prixAvion=" + prixAvion
                + ", dateCreation=" + ", company=" + company + "]";
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}