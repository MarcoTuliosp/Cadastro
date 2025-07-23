package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String BoasVindas() {
        return ("Essa é minha primeira mensagem");

    }

    //adicionar ninja(CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";

    }

    //Mostrar todos os Ninjas(READ)
    @GetMapping("/todos")
    public String mostarTodosNinja() {
        return "Mostrar  Ninjas";

    }

    //Mostrar todos os Ninjas por ID(READ)
    @GetMapping("/todosID")
    public String mostarTodosNinjaPorId() {
        return "Mostrar todos os Ninjas Por ID";
    }

    //Alterar dados do Ninja(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninjas por ID ";
    }

    //deletar ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por Id";
    }
}