package guru.springframework.spring5petclinic.controllers;

import guru.springframework.spring5petclinic.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    //when request matches pet or pet.html,
    @RequestMapping({"/pet", "/pet.html", "/pets", "/pets.html"})
    public String listPets() {
        return "pets"; //this is thymeleaf filename in templates folder
    }
}
