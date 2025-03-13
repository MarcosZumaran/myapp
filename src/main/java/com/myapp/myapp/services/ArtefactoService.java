package com.myapp.myapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.myapp.model.Artefacto;
import com.myapp.myapp.repository.ArtefactoRepository;

@Service
public class ArtefactoService {

    private final ArtefactoRepository artefactoRepository;

    public ArtefactoService(ArtefactoRepository artefactoRepository) {
        this.artefactoRepository = artefactoRepository;
    }

    public List<Artefacto> listarArtefactos(){
        return artefactoRepository.findAll();
    }

    public Artefacto guardarArtefacto(Artefacto artefacto){
        if (artefacto == null || artefacto.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El artefacto no debe estar vacio!!!");
        }
        return artefactoRepository.save(artefacto);
    }

    public void eliminarArtefacto(int id){
        artefactoRepository.deleteById(id);
    }

    
}
