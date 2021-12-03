package com.appweb.recuperacion.repositories;

import com.appweb.recuperacion.models.DireccionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends CrudRepository<DireccionModel, Long> {



}
