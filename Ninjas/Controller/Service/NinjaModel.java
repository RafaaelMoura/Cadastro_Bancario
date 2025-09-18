package com.example.demo.Ninjas.Controller.Service;

import com.example.demo.Missoes.MissaoModel;
import jakarta.persistence.*;

@Entity //Trasforma uma classe em uma entidade (ou tabela) - JPA - JAVA PERSISTENCE API
@Table(name = "tb_tabela") /*Nome a entidade (tabela) criada atráves do @Entity (boa pratica utilizar o nome com *tb* e separado por _
                            com todas as letras minusculas ) */
public class NinjaModel {

    @Id //Para preencher os id's dos elementos
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria a ordenação da geração dos id's *IDENTITY - cria uma ordenação numerica 1,2,3 ...
    private long id;
    private String nome;
    private String emaii;
    private int idade;

    @ManyToOne // Essa annotation representa que muitos ninjas podem ter uma missão
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave estrangeira
    private MissaoModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(int idade, String emaii, String nome) {
        this.idade = idade;
        this.emaii = emaii;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmaii() {
        return emaii;
    }

    public void setEmaii(String emaii) {
        this.emaii = emaii;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
