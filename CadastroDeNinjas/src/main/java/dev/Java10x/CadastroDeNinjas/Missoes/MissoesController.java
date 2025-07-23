package dev.Java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {


    // GET -->Manda uma requisiçao para MOSTAR missoes
    @GetMapping("/listar")
        public String listarMissoes(){
            return "Missoes listadas com sucesso";
    }

    // POST-->Manda uma requisiçao para CRIAR missoes
    @PostMapping("/criar")
        public String criarMissao(){
            return "Missao Craiada com sucesso";
    }

    // PUT-->Manda uma requisiçao para ALTERAR missoes
    @PutMapping("/alterar")
        public String alterarMissao(){
            return "Missao Alterada com sucesso";

    }

    // DELETE -->Manda uma requisiçao para DELETAR missoes
    @DeleteMapping("/deletar")
        public String deletarMissao(){
            return "Missao deletada com sucesso";

    }



}
