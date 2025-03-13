package com.myapp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.myapp.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
    
}
