package guru.springframework.spring5petclinic.controllers;

import guru.springframework.spring5petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    //when request matches vet or vet.html,
    @RequestMapping({"/vet", "/vet.html", "/vets", "/vets.html"})
    public String listVets() {
        return "vets"; //this is thymeleaf filename in templates folder
    }
}
