package com.ola.mundo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    private String nome;
    private int matricula;

    @ManyToOne
    @JoinColumn(name = "turmaId")
    private TurmaModel turma;
    

    public AlunoModel(){

    }

    public AlunoModel(int id, String nome, int matricula, TurmaModel turma) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public TurmaModel getTurma() {
        return turma;
    }

    public void setTurma(TurmaModel turma) {
        this.turma = turma;
    }

    

}
