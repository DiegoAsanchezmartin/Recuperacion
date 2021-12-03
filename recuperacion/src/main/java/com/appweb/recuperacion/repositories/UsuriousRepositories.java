package com.appweb.recuperacion.repositories;


import com.appweb.recuperacion.models.UsuriousModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuriousRepositories<Int> extends CrudRepository <UsuriousModel, Int> {

}
