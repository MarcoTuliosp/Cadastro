package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinja() {
        return  ninjaService.listarNinjas();

    }

    //Mostrar todos os Ninjas por ID(READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarPorId(@PathVariable  Long id) {
        return ninjaService.listarPorId(id);
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