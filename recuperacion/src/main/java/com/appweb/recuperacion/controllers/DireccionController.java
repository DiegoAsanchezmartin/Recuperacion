package com.appweb.recuperacion.controllers;

import com.appweb.recuperacion.models.DireccionModel;
import com.appweb.recuperacion.services.DiereccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    DiereccionService diereccionService;

   @GetMapping()
    public ArrayList<DireccionModel> obtenerDireccion(){

        return diereccionService.obtenerDireccion();

    }

    //@PostMapping()
    //public <direccion> DireccionModel guardarDireccion(@RequestBody direccion){

      // return this.diereccionService.guardarDireccion(direccion);
    //}






}
