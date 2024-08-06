package com.example.api_eventos_usuarios.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @GetMapping
    public List<String> ListaUsuarios() {

        List<String> strings = Collections.emptyList();
        return strings;
    }

}
