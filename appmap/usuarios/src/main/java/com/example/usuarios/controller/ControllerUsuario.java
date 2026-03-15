package com.example.usuarios.controller;

import com.example.usuarios.service.ServiceUsuario;
import com.example.usuarios.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {

    @Autowired
    private ServiceUsuario serviceUsuario;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return serviceUsuario.getUsuarios();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return serviceUsuario.crearUsuario(usuario);
    }

    @GetMapping("/test")
        public String test(){
            return "microservicio funcionando";
    }

}