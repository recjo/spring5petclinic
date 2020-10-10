package guru.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //when request matches root, /, index or index.html,
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index"; //this is thymeleaf filename in templates folder
    }
}
