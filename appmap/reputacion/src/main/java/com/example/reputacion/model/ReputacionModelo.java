package com.example.reputacion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReputacionModelo {
    private String id;
    private String idUsuario;
    private String idViaje;
    private String comentario;
    private int calificacion;
}


