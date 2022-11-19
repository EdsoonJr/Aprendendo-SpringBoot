package com.ola.mundo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ola.mundo.model.AlunoModel;

@Repository
public interface AlunoRepository extends CrudRepository<AlunoModel,Integer>{

    
}
