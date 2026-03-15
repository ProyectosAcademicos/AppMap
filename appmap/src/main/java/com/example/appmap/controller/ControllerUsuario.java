package com.example.appmap.controller;

import com.example.appmap.service.ServiceUsuario;
import com.example.appmap.model.Usuario;

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

}