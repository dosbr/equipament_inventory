package br.com.dos.hardwareinventory.services;

import br.com.dos.hardwareinventory.controllers.dto.EquipamentDTO;
import br.com.dos.hardwareinventory.entities.Equipament;
import br.com.dos.hardwareinventory.repositories.EquipamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentService {

    EquipamentRepository repository;
    public EquipamentService(EquipamentRepository repository) {
        this.repository = repository;
    }

    public List<Equipament> listAllEquipaments() {
        return repository.findAll();
    }

    public void createEquipament(EquipamentDTO equipamentDTO) {
        Equipament equipament = equipamentDTO.convert();
        repository.save(equipament);
    }
}
