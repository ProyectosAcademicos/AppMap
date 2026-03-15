package com.example.vehiculos.service;

import org.springframework.stereotype.Service;
import com.example.vehiculos.model.Vehiculo;

import java.util.List;
import java.util.ArrayList;

@Service
public class ServiceVehiculo {
    
    private List<Vehiculo> vehiculos = new ArrayList<>();

    //Listar los vehículos 
    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    //Crear un nuevo vehículo
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        return vehiculo;
    }

    //cambiar estado del vehículo
    public Vehiculo cambiarEstadoVehiculo(String marca, String modelo, String nuevoEstado) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo)) {
                vehiculo.setEstado(nuevoEstado);
                return vehiculo;
            }
        }
        return null;
    }
}
