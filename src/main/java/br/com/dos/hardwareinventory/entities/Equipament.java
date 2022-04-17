package br.com.dos.hardwareinventory.entities;

import br.com.dos.hardwareinventory.entities.enums.EquipamentType;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Equipament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private EquipamentType type;

    private String serviceTag;

    private String serialNumber;

    private String brand;

    private String model;

    public Equipament() {
    }

    public Equipament(EquipamentType type, String serviceTag, String serialNumber, String brand, String model) {
        this.id = id;
        this.type = type;
        this.serviceTag = serviceTag;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
    }
}
