package com.zaubershlosss.zpetclinic.bootstrap;

import com.zaubershlosss.zpetclinic.model.Owner;
import com.zaubershlosss.zpetclinic.model.Vet;
import com.zaubershlosss.zpetclinic.services.OwnerService;
import com.zaubershlosss.zpetclinic.services.VetService;
import com.zaubershlosss.zpetclinic.services.map.OwnerServiceMap;
import com.zaubershlosss.zpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner(); owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");
        ownerService.save(owner2);

        System.out.println("Loaded Owners..."); 
        Vet vet1 = new Vet(); vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Trololoshkin");
        vet2.setLastName("Ebanatovich");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
