package com.example.appmap.service;

import com.example.appmap.model.Ruta;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


import java.util.List;
import java.util.ArrayList;


@Service
public class ServiceRuta {

    private List<Ruta> rutas = new ArrayList<>();

    public List<Ruta> buscarRutas(String origen, String destino){

        List<Ruta> nuevasRutas = new ArrayList<>();

        nuevasRutas.add(new Ruta("1", origen, destino, "Uber", 30, 5000.0));
        nuevasRutas.add(new Ruta("2", origen, destino, "Taxi", 25, 3000.0));
        nuevasRutas.add(new Ruta("3", origen, destino, "Metro", 20, 800.0));
        nuevasRutas.add(new Ruta("4", origen, destino, "Bus + Metro", 35, 900.0));
        nuevasRutas.add(new Ruta("5", origen, destino, "Metro + Taxi", 28, 800.0));

        rutas.addAll(nuevasRutas); // guardamos las rutas creadas

        return nuevasRutas;
    }

    public List<Ruta> listarRutas() {
        return rutas;
    }

    public Ruta crearRuta(Ruta ruta) {
        return ruta;
    }
    
    //comentario
}
