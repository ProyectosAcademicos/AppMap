package com.example.appmap.controller;

import com.example.appmap.service.ServiceRuta;
import com.example.appmap.model.Ruta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rutas")
public class ControllerRuta {

    @Autowired
    private ServiceRuta serviceRuta;

    @GetMapping
    public List<Ruta> listarRutas() {
        return serviceRuta.getRutas();
    }
    
}
