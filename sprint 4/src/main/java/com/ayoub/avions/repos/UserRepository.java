package com.ayoub.avions.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ayoub.avions.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
}