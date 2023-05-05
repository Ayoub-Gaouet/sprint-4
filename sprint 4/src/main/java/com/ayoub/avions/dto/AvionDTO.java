package com.ayoub.avions.dto;

import com.ayoub.avions.entities.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AvionDTO {
    private Long idAvion;
    private String nomAvion;
    private Double prixAvion;
    private Date dateCreation;
    private Company ccompany;

}
