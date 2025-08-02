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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return  ninjaService.criarNinja(ninja);

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


    //deletar ninja(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);

    }
    //Alterar dados do Ninja(UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

}