package dev.Java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
