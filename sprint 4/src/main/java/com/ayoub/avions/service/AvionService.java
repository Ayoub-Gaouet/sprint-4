package com.ayoub.avions.service;

import com.ayoub.avions.entities.Avion;
import com.ayoub.avions.entities.Company;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AvionService {
    Avion saveAvion(Avion a);
    Avion updateAvion(Avion a);
    void deleteAvion(Avion a);
    void deleteAvionById(Long id);
    Avion getAvion(Long id);
    List<Avion> getAllAvions();
    List<Company> getAllCompanys();

    Page<Avion> getAllAvionsParPage(int page, int size);
    List<Avion> findByNomAvion(String nom);
    List<Avion> findByNomAvionContains(String nom);
    List<Avion> findByNomPrix (String nom, Double prix);
    List<Avion> findByCompany (Company company);
    List<Avion> findByCompanyIdCom(Long id);
    List<Avion> findByOrderByNomAvionAsc();
    List<Avion> trierAvionsNomsPrix();
}
