package guru.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    //when request matches vet or vet.html,
    @RequestMapping({"/vet", "/vet.html", "/vets", "/vets.html"})
    public String listVets() {
        return "vets"; //this is thymeleaf filename in templates folder
    }
}
