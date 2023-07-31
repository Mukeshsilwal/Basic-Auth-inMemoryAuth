package com.info.service;

import com.info.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecurityRepo extends JpaRepository<Security,Integer> {
    Optional<Security> findByUsername(String username);
}
