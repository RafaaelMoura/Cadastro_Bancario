package com.example.demo.Missoes;

import com.example.demo.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nivel;


    @OneToMany(mappedBy = "missoes") //Annotation que representa uma missão para varios ninjas
  private List<NinjaModel> ninjas;



    public MissaoModel() {
    }

    public MissaoModel(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
