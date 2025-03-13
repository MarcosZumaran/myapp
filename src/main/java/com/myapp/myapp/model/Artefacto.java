package com.myapp.myapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "artefacto")
public class Artefacto {
    
    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "marca", length = 60, nullable = false)
    private String marca;

    @ManyToOne// con esto detectara mejor la relacion
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @ManyToOne 
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    // BOB CONSTRUYE ¿PODRA, HA-CERLO? XdxDxDxdxDDD

    public Artefacto() {
    }

    public Artefacto(String nombre, String marca, Persona persona) {
        this.nombre = nombre;
        this.marca = marca;
        this.persona = persona;
    }

    public Artefacto(String nombre, String marca, Persona persona, Proveedor proveedor) {
        this.nombre = nombre;
        this.marca = marca;
        this.persona = persona;
        this.proveedor = proveedor;
    }

    public Artefacto(int id, String nombre, String marca, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.persona = persona;
    }

    public Artefacto(int id, String nombre, String marca, Persona persona, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.persona = persona;
        this.proveedor = proveedor;
    }


    // GTRS & STRS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    

}
