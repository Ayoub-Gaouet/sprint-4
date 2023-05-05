package com.ayoub.avions.repos;

import com.ayoub.avions.entities.Avion;
import com.ayoub.avions.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "rest")

public interface AvionRepository extends JpaRepository<Avion, Long> {
    List<Avion> findByNomAvion(String nom);
    List<Avion> findByNomAvionContains(String nom);
    @Query("select a from Avion a where a.nomAvion like %:nom and a.prixAvion > :prix")
    List<Avion> findByNomPrix (@Param("nom") String nom, @Param("prix") Double prix);
    @Query("select a from Avion a where a.company = ?1")
    List<Avion> findByCompany (Company company);
    List<Avion> findByCompanyIdCom(Long id);
    List<Avion> findByOrderByNomAvionAsc();
    @Query("select a from Avion a order by a.nomAvion ASC, a.prixAvion DESC")
    List<Avion> trierAvionsNomsPrix ();
}
