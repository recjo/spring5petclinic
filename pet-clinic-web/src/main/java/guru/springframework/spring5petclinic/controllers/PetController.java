package guru.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    //when request matches pet or pet.html,
    @RequestMapping({"/pet", "/pet.html", "/pets", "/pets.html"})
    public String listPets() {
        return "pets"; //this is thymeleaf filename in templates folder
    }
}
