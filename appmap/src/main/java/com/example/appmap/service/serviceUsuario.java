package com.example.appmap.service;

import com.example.appmap.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ServiceUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public Usuario crearUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

}