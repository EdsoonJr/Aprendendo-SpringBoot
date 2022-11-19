package com.ola.mundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ola.mundo.model.TurmaModel;
import com.ola.mundo.repository.TurmaRepository;

@RestController
public class TurmaController {
   @Autowired
   private TurmaRepository turmaRepository; 

   @PostMapping("/turma")
   @ResponseStatus(HttpStatus.CREATED)
   public @ResponseBody TurmaModel addNewTurma(@RequestBody TurmaModel turma){
    return turmaRepository.save(turma);
   }

   @GetMapping("/turma")
   public @ResponseBody Iterable<TurmaModel> getAllTurmas(){
    return turmaRepository.findAll();
   }

   @GetMapping("/turma/{id}")
   public @ResponseBody TurmaModel getTurmaId(@PathVariable int id){
    return turmaRepository.findById(id).get();

   }

   @DeleteMapping("/turma/{id}")
   public @ResponseBody void deleteTurma(@PathVariable int id){
    turmaRepository.deleteById(id);
   }
}
