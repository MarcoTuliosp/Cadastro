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
}
