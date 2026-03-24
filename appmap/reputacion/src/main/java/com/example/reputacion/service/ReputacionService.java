package com.example.reputacion.service;

import com.example.reputacion.model.ReputacionModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReputacionService {

    private List<ReputacionModelo> reputaciones = new ArrayList<>(); // creamos una lista de reputaciones para almacenar las reputaciones creadas

    public ReputacionModelo crearReputacion(ReputacionModelo reputacion) {
        reputaciones.add(reputacion); // agregamos la reputación a la lista de reputaciones
        return reputacion; // devolvemos la reputación creada
    }

    public ReputacionModelo obtenerReputacionPorId(String id) {
        return reputaciones.stream()
                .filter(r -> r.getId().equals(id)) // acá le decimos al código que filtre la lista de reputaciones y busque aquella cuyo id sea igual al id que se le pasó como parámetro
                .findFirst() // acá le decimos al código que busque el primer elemento que cumpla la condición
                .orElse(null); // si no encuentra ningún elemento que cumpla la condición, devuelve null
    }
}