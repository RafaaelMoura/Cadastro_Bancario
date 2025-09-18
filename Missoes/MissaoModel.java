package com.example.demo.Missoes;

import com.example.demo.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nivel;

    @OneToMany(mappedBy = "missoes") //Annotation que representa uma missão para varios ninjas
    private List<NinjaModel> ninjas;


}
