package com.Group11.TugasBesar.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Group11.TugasBesar.models.PemilikKost;

@Repository
public interface PemilikKostRepository extends JpaRepository<PemilikKost, String>{
    
    // Optional<PemilikKost> findByName(String name);
    
}