package com.appweb.recuperacion.controllers;

import com.appweb.recuperacion.models.UsuriousModel;
import com.appweb.recuperacion.services.UsuriousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usurious")
public class UsuarioController {

    @Autowired
    UsuriousService usuarioService;

    @GetMapping()
    public ArrayList<UsuriousModel> obtenerUsuario(){

        return usuarioService.oftenerUsurious();

    }

    @PostMapping()

    public UsuriousModel guardarUsuario(@RequestBody UsuriousModel usuario){

        return this.usuarioService.guarderUsurious(usuario);

    }






}
