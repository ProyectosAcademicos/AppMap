package com.example.appmap.service;

import com.example.appmap.modelo.Ruta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;


@Service
public class serviceRuta {

    public List<Ruta> getRutas(){
        List<Ruta> rutas = new ArrayList<>();

        rutas.add(new Ruta(1,"Parque Balmaceda", "Parque Bustamante", 3000, 5000));
        rutas.add(new Ruta(2,"Barrio Italia", "Estación Central", 3000, 5000));

        return rutas;
    } 
    
}
