package com.myapp.myapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.myapp.model.Proveedor;
import com.myapp.myapp.repository.ProveedorRepository;

@Service
public class ProveedorService {
    
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> listaProveedores(){
        return proveedorRepository.findAll();
    }

    public Proveedor guardarProveedor(Proveedor proveedor){
        if (proveedor == null || proveedor.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El proveedor no puede estar vacio!!!");
        }
        return proveedorRepository.save(proveedor);
    }

    public void eliminarProveedor(int id){
        proveedorRepository.deleteById(id);
    }

}
