package com.zaubershlosss.zpetclinic.bootstrap;

import com.zaubershlosss.zpetclinic.model.Owner;
import com.zaubershlosss.zpetclinic.model.PetType;
import com.zaubershlosss.zpetclinic.model.Vet;
import com.zaubershlosss.zpetclinic.services.OwnerService;
import com.zaubershlosss.zpetclinic.services.PetTypeService;
import com.zaubershlosss.zpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");
        ownerService.save(owner2);

        System.out.println("Loaded Owners..."); 
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Trololoshkin");
        vet2.setLastName("Ebanatovich");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
