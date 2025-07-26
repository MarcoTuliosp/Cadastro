package dev.Java10x.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    private String nome;
    private String dificuldade;

    //OneToMany -> Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;


}
