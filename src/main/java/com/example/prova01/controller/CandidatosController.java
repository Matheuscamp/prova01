package com.example.prova01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CandidatosController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
