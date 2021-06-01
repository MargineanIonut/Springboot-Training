package com.example.springtraining.bootstrap;

import com.example.springtraining.model.Owner;
import com.example.springtraining.model.Vet;
import com.example.springtraining.service.OwnerService;
import com.example.springtraining.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Jordan");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Ionut");
        owner2.setLastName("Marginean");

        ownerService.save(owner2);

        Owner owner3 = new Owner();

        owner3.setFirstName("Flaviu");
        owner3.setLastName("Ivanciuc");

        ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();


        vet1.setFirstName("Vet1firstname");
        vet1.setLastName("Vet1lastname");

        vetService.save(vet1);

        Vet vet2 = new Vet();


        vet2.setFirstName("Vet2firstname");
        vet2.setLastName("Vet2lastname");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
