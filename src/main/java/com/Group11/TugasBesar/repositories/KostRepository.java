package com.Group11.TugasBesar.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Group11.TugasBesar.models.Kost;

@Repository
public interface KostRepository extends JpaRepository<Kost, Integer>{
    
    Optional<Kost> findByName(String name);
}
