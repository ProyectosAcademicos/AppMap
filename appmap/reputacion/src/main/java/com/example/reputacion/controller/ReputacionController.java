package com.example.reputacion.controller;

import com.example.reputacion.model.ReputacionModelo;
import com.example.reputacion.service.ReputacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reputacion")
public class ReputacionController {
    
    @Autowired
    private ReputacionService reputacionService;

    @PostMapping
    public ResponseEntity<ReputacionModelo> crearReputacion(@RequestBody ReputacionModelo reputacion) {
        ReputacionModelo nuevaReputacion = reputacionService.crearReputacion(reputacion);
        return ResponseEntity.ok(nuevaReputacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReputacionModelo> obtenerReputacionPorId(@PathVariable String id) {
        ReputacionModelo reputacion = reputacionService.obtenerReputacionPorId(id);
        if (reputacion != null) {
            return ResponseEntity.ok(reputacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}