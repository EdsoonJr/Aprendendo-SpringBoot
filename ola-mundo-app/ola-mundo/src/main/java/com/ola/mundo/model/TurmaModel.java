package com.ola.mundo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TurmaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String turma;
    private int codTurma;

    @OneToMany(mappedBy = "turma")
    private List<AlunoModel> alunos = new ArrayList<>();

    public TurmaModel(){

    }

    public TurmaModel(int id, String turma, int codTurma) {
        this.id = id;
        this.turma = turma;
        this.codTurma = codTurma;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

}
