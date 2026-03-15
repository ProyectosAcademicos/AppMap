package com.example.vehiculos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {
    private String id;
    private String marca;
    private String modelo;
    private String estado;
}