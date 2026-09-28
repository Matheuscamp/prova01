package com.example.prova01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CandidatosTseController {
    
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(candidatosTseService candidatosTseService){
        this.candidatosTseService = candidatosTseService;
    }
}
