package com.Group11.TugasBesar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Group11.TugasBesar.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String>{
    
}
