package br.com.dos.hardwareinventory.controllers.dto;

import br.com.dos.hardwareinventory.entities.Equipament;
import br.com.dos.hardwareinventory.entities.enums.EquipamentType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EquipamentDTO {

    private EquipamentType type;

    private String serviceTag;

    private String serialNumber;

    private String brand;

    private String model;

    public Equipament convert() {
        return new Equipament(this.type, this.serviceTag, this.serialNumber, this.brand, this.model);
    }
}
