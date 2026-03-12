package com.example.appmap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//Genera automáticamente métodos getters, setters, toString(), equals(), y hashCode() para todos los campos de la clase.
@AllArgsConstructor
//Genera un constructor con todos los atributos de la clase como parámetros.
@NoArgsConstructor
//Crea un constructor vacío sin parámetros. Es obligatorio para que JPA (Java Persistence API) pueda instanciar entidades desde la base de datos.

public class Usuario {

    private String id;
    private String nombre;
    private Int telefono;
}
