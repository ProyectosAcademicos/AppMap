package com.example.appmap.service;

import com.example.appmap.model.Ruta;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

import java.util.List;
import java.util.ArrayList;


@Service
public class ServiceRuta {

    public List<Ruta> getRutas(){
        List<Ruta> rutas = new ArrayList<>();

        rutas.add(new Ruta("1","Parque Balmaceda", "Parque Bustamante", LocalDateTime.now(), 5000.0));
        rutas.add(new Ruta("2","Barrio Italia", "Estación Central", LocalDateTime.now(), 5000.0));

        return rutas;
    } 
    
}
