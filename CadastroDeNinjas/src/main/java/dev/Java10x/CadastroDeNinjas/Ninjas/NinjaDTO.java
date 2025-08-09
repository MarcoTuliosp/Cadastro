package dev.Java10x.CadastroDeNinjas.Ninjas;

import lombok.AllArgsConstructor;
import lombok.Data;
import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaDTO {


        private Long id;

        private String nome;

        private String email;

        private int idade;

        private MissoesModel missoes;

        private String rank;

    }
