package com.example.appmap.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private String id;
    private String nombre;
    private int telefono;
}
