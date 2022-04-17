package br.com.dos.hardwareinventory.controllers;

import br.com.dos.hardwareinventory.controllers.dto.EquipamentDTO;
import br.com.dos.hardwareinventory.entities.Equipament;
import br.com.dos.hardwareinventory.repositories.EquipamentRepository;
import br.com.dos.hardwareinventory.services.EquipamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/equipaments")
public class EquipamentController {

    @Autowired
    private EquipamentRepository repository;

    @Autowired
    private EquipamentService service;

    @GetMapping
    public List<Equipament> listEquipaments() {
        return service.listAllEquipaments();
    }

    @PostMapping
    public void createEquipament(@RequestBody EquipamentDTO equipament) {
        service.createEquipament(equipament);
    }
}
