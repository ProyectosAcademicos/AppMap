package com.example.appmap.controller;

import com.example.appmap.service.serviceRuta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/rutas")
public class planificacionController {

    @Autowired
    private serviceRuta serviceRuta;

    @GetMapping
    public List<Ruta> listarRutas() {
        return serviceRuta.;
    }
    
}
