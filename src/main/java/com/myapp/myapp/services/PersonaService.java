package com.myapp.myapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.myapp.model.Persona;
import com.myapp.myapp.repository.PersonaRepository;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> listarPersonas(){
        return personaRepository.findAll(); //el find all hace la consulta sql automaticamente gracias a spring
    }

    public Persona guardarPersona(Persona persona){
        // condicional de validacion, solo porque chat gpt me dio una observacion
        // aunque viendolo de forma practica, no parece tan necesario esta validacion
        if (persona == null || persona.getNombre().isEmpty()) {
            throw new IllegalArgumentException("La persona no puede estar vacia!!!");
        }
        return personaRepository.save(persona); // hace la ejecucion del codigo sql para guardar o enviar los datos de la persona
    }

    public void eliminarPersona(int id){
        personaRepository.deleteById(id);
    }
    
}
