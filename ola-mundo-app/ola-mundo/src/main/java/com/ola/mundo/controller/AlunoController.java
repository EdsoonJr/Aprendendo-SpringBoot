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

import com.ola.mundo.model.AlunoModel;
import com.ola.mundo.repository.AlunoRepository;

@RestController
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/aluno")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody AlunoModel addNewAluno (@RequestBody AlunoModel aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping("/aluno")
    public @ResponseBody Iterable<AlunoModel> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/aluno/{id}")
    public @ResponseBody AlunoModel getAlunosId(@PathVariable int id) {
        return alunoRepository.findById(id).get();
    }

    @DeleteMapping("/aluno/{id}")
    public @ResponseBody void deleteAluno(@PathVariable int id){
        alunoRepository.deleteById(id);
    }

}
