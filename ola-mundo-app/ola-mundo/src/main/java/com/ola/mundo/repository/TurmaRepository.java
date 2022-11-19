package com.ola.mundo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.ola.mundo.model.TurmaModel;

@Repository
public interface TurmaRepository extends CrudRepository<TurmaModel,Integer> {
    
}
