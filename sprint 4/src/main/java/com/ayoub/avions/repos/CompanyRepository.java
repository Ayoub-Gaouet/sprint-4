package com.ayoub.avions.repos;

import com.ayoub.avions.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Long> {
}
