package com.myapp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.myapp.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    
}
