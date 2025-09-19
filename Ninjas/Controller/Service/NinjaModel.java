package com.example.demo.Ninjas.Controller.Service;

import com.example.demo.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Trasforma uma classe em uma entidade (ou tabela) - JPA - JAVA PERSISTENCE API
@Table(name = "tb_tabela") /*Nome a entidade (tabela) criada atráves do @Entity (boa pratica utilizar o nome com *tb* e separado por _
                            com todas as letras minusculas ) */

@Data // Essa annotation gerencia os Getters e Setters
@NoArgsConstructor // Essa annotation gerencia o Construtor vazio
@AllArgsConstructor // Essa annotation gerencia o Construtor completo
public class NinjaModel {

    @Id //Para preencher os id's dos elementos
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria a ordenação da geração dos id's *IDENTITY - cria uma ordenação numerica 1,2,3 ...

    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true) // Colunm: especifica coluna no caso "coluna email" | (unique = true) Indica que as informações são unicas
    private String emaii;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @ManyToOne // Essa annotation representa que muitos ninjas podem ter uma missão
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave estrangeira
    private MissaoModel missoes;


}
