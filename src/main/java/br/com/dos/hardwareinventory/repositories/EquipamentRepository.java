package br.com.dos.hardwareinventory.repositories;

import br.com.dos.hardwareinventory.entities.Equipament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface EquipamentRepository extends JpaRepository<Equipament, UUID> {
}
