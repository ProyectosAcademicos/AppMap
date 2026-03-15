package com.example.vehiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.vehiculos.model.Vehiculo;
import com.example.vehiculos.service.ServiceVehiculo;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private ServiceVehiculo serviceVehiculo;

    @GetMapping
    public List<Vehiculo> listarVehiculos() {
        return serviceVehiculo.listarVehiculos();
    }

    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return serviceVehiculo.crearVehiculo(vehiculo);
    }

    @PutMapping("/estado")
    public Vehiculo cambiarEstadoVehiculo(@RequestBody Vehiculo vehiculo) {
        return serviceVehiculo.cambiarEstadoVehiculo(
            vehiculo.getId(),
            vehiculo.getEstado()
        );
    }
}