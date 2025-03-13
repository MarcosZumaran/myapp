package com.myapp.myapp.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.model.Persona;
import com.myapp.myapp.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> obtenerPersonas(){
        return personaService.listarPersonas();
    }

    @PostMapping
    public Persona agregarPersona(@Validated @RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
}
