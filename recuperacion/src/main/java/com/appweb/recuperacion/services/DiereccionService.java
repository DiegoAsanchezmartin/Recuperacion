package com.appweb.recuperacion.services;

import com.appweb.recuperacion.models.DireccionModel;
import com.appweb.recuperacion.repositories.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DiereccionService {
    @Autowired
    DireccionRepository direccionRepository;


    public ArrayList<DireccionModel> obtenerDireccion(){

        return (ArrayList<DireccionModel>) direccionRepository.findAll();
    }



    public DireccionModel guardarDireccion(DireccionModel direccion){

        return direccionRepository.save(direccion);


    }


}
