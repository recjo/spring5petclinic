package guru.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    //when request matches owner or owner.html,
    @RequestMapping({"/owner", "/owner.html", "/owners", "/owners.html"})
    public String listOwners() {
        return "owners"; //this is thymeleaf filename in templates folder
    }
}
