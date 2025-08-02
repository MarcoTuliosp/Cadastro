package dev.Java10x.CadastroDeNinjas.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    //Listar todos os Ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();

    }

    //Listar Ninjas por ID
     public NinjaModel listarPorId(Long id) {
         Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
         return  ninjaPorId.orElse(null);
     }

    //Criar um Novo Ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Deletar Ninja -> Tem que ser um metodo VOID

    public  void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }
}
