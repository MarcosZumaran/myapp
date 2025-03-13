package com.myapp.myapp.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.model.Proveedor;
import com.myapp.myapp.services.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<Proveedor> obtenerProveedores(){
        return proveedorService.listaProveedores();
    }

    @PostMapping
    public Proveedor agregarProveedor(@Validated @RequestBody Proveedor proveedor){
        return proveedorService.guardarProveedor(proveedor);
    }
    
}
