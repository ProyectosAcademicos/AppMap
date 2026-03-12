package com.example.appmap.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
//Genera automáticamente métodos getters, setters, toString(), equals(), y hashCode() para todos los campos de la clase.
@AllArgsConstructor
//Genera un constructor con todos los atributos de la clase como parámetros.
@NoArgsConstructor
//Crea un constructor vacío sin parámetros. Es obligatorio para que JPA (Java Persistence API) pueda instanciar entidades desde la base de datos.

public class Ruta {
    private String id;
    private String origen;
    private String destino;
    private LocalDateTime tiempoEstimado;
    private Double costo;
}
