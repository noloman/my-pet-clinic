package me.manulorenzo.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {
    @RequestMapping({"/vets", "vets/index.html", "vets/index.html"})
    public String listsVets() {
        return "vets/index";
    }
}
