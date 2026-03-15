package com.example.appmap.controller;

import com.example.appmap.service.ServiceRuta;
import com.example.appmap.model.Ruta;
import com.example.appmap.dto.SolicitudRuta;

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
        return serviceRuta.listarRutas();
    }

    @GetMapping("/buscar")
        public List<Ruta> buscarRutas(
        @RequestParam String origen,
        @RequestParam String destino) {

    return serviceRuta.buscarRutas(origen, destino);
    }

    
    @PostMapping
    public List<Ruta> crearRuta(@RequestBody SolicitudRuta solicitud) {

        return serviceRuta.buscarRutas(
                solicitud.getOrigen(),
                solicitud.getDestino()
        );
    }

}