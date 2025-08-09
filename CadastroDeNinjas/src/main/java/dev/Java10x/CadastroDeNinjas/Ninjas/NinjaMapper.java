package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
        if (ninjaDTO == null) return null;

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        if (ninjaModel == null) return null;

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        return ninjaDTO;
    }
}

