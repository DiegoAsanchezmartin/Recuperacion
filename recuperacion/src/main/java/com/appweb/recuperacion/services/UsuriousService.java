package com.appweb.recuperacion.services;

import com.appweb.recuperacion.models.UsuriousModel;
import com.appweb.recuperacion.repositories.UsuriousRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuriousService {
    @Autowired
    UsuriousRepositories usuriousRepositories;

    public ArrayList<UsuriousModel> oftenerUsurious(){
       return (ArrayList<UsuriousModel>) usuriousRepositories.findAll();

    }


    public UsuriousModel guarderUsurious(UsuriousModel usurious) {

        return (UsuriousModel) usuriousRepositories.save(usurious);


    }
}
