package com.example.appmap.controller;

import com.example.appmap.service.serviceRuta;
import com.example.appmap.modelo.Ruta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rutas")
public class controllerRuta {

    @Autowired
    private serviceRuta serviceRuta;

    @GetMapping
    public List<Ruta> listarRutas() {
        return serviceRuta.getRutas();
    }
    
}
