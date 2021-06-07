package com.example.springtraining.bootstrap;

import com.example.springtraining.model.*;
import com.example.springtraining.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Jordan");
        owner1.setAddress("123 GrooveStreet");
        owner1.setCity("Chicago");
        owner1.setTelephone("12343213");


        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Doggy");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Ionut");
        owner2.setLastName("Marginean");
        owner2.setAddress("123 GrooveStreet");
        owner2.setCity("Chicago");
        owner2.setTelephone("54343213");

        Pet ionutCat = new Pet();
        ionutCat.setName("Tom");
        ionutCat.setOwner(owner2);
        ionutCat.setBirthDate(LocalDate.now());
        ionutCat.setPetType(savedCatType);
        owner2.getPets().add(ionutCat);
        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(ionutCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Tom from Tom&Jerry");
        visitService.save(catVisit);

        Owner owner3 = new Owner();
        owner3.setFirstName("Flaviu");
        owner3.setLastName("Ivanciuc");
        ownerService.save(owner3);
        System.out.println("Loaded Owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Vet1firstname");
        vet1.setLastName("Vet1lastname");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Vet2firstname");
        vet2.setLastName("Vet2lastname");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
        System.out.println("Loaded Vets...");
    }
}
