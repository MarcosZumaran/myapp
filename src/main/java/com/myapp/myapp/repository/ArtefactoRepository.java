package com.myapp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.myapp.model.Artefacto;

public interface ArtefactoRepository extends JpaRepository<Artefacto, Integer>{
    
}
