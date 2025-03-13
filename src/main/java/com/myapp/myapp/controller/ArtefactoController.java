package com.myapp.myapp.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.model.Artefacto;
import com.myapp.myapp.services.ArtefactoService;

@RestController
@RequestMapping("/artefactos")
public class ArtefactoController {
    
    private final ArtefactoService artefactoService;

    public ArtefactoController(ArtefactoService artefactoService) {
        this.artefactoService = artefactoService;
    }

    @GetMapping
    public List<Artefacto> obtenerArtefactos(){
        return artefactoService.listarArtefactos();
    }

    @PostMapping
    public Artefacto agregarArtefacto(@Validated @RequestBody Artefacto artefacto){
        return artefactoService.guardarArtefacto(artefacto);
    }
}
