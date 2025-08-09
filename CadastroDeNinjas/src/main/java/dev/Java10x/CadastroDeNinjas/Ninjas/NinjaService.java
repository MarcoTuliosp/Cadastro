package dev.Java10x.CadastroDeNinjas.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os Ninjas
    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();

        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());

    }

    //Listar Ninjas por ID
    public NinjaDTO listarPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);

    }

    //Criar um Novo Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja =  ninjaMapper.map(ninjaDTO);
       ninja =  ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // Deletar Ninja -> Tem que ser um metodo VOID

    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }


    //Atualizar Ninja
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
        NinjaModel ninjaAualizado = ninjaMapper.map(ninjaDTO);
        ninjaAualizado.setId(id);

        NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAualizado);
        return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }


}

