package com.ayoub.avions.service;

import com.ayoub.avions.dto.AvionDTO;
import com.ayoub.avions.entities.Avion;
import com.ayoub.avions.entities.Company;
import com.ayoub.avions.repos.AvionRepository;
import com.ayoub.avions.repos.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImpl implements AvionService{
    @Autowired
    AvionRepository avionRepository;
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public Avion saveAvion(Avion p) {
        return avionRepository.save(p);
    }
    @Override
    public Avion updateAvion(Avion p) {
        return avionRepository.save(p);
    }
    @Override
    public void deleteAvion(Avion p) {
        avionRepository.delete(p);
    }
    @Override
    public void deleteAvionById(Long id) {
        avionRepository.deleteById(id);
    }
    @Override
    public Avion getAvion(Long id) {
        return avionRepository.findById(id).get();
    }
    @Override
    public List<Avion> getAllAvions() {
        return avionRepository.findAll();
    }
    @Override
    public Page<Avion> getAllAvionsParPage(int page, int size) {
        return avionRepository.findAll(PageRequest.of(page, size));
    }
    @Override
    public List<Avion> findByNomAvion(String nom) {
        return avionRepository.findByNomAvion(nom);
    }
    @Override
    public List<Avion> findByNomAvionContains(String nom) {
        return avionRepository.findByNomAvionContains(nom);
    }
    @Override
    public List<Avion> findByNomPrix(String nom, Double prix) {
        return avionRepository.findByNomPrix(nom, prix);
    }
    @Override
    public List<Avion> findByCompany(Company company) {
        return avionRepository.findByCompany(company);
    }
    @Override
    public List<Avion> findByCompanyIdCom(Long id) {
        return avionRepository.findByCompanyIdCom(id);
    }
    @Override
    public List<Avion> findByOrderByNomAvionAsc() {
        return avionRepository.findByOrderByNomAvionAsc();
    }
    @Override
    public List<Avion> trierAvionsNomsPrix() {
        return avionRepository.trierAvionsNomsPrix();
    }
    @Override
    public List<Company> getAllCompanys() {return companyRepository.findAll();}

}
