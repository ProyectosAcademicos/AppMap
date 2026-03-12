package com.example.appmap.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ruta {
    private String id;
    private String origen;
    private String destino;
    private LocalDateTime tiempoEstimado;
    private Double costo;
}
