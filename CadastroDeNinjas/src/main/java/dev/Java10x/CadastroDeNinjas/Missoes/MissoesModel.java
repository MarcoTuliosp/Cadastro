package dev.Java10x.CadastroDeNinjas.Missoes;

import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    private String nome;
    private String dificuldade;

    @ManyToOne
    private NinjaModel ninjas;


    public MissoesModel(){


    }

    public MissoesModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

    }
    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(String dificuldade) {

    }
}
