package guru.springframework.spring5petclinic.controllers;

import guru.springframework.spring5petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //when request matches owner or owner.html,
    @RequestMapping({"/owner", "/owner.html", "/owners", "/owners.html"})
    public String listOwners(Model model) {
        //first param is the name of the attribute (to fetch it by later)
        model.addAttribute("owners", ownerService.findAll());

        return "owners"; //this is thymeleaf filename in templates folder
    }
}
