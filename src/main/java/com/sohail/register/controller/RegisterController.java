package com.sohail.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/regis")
    public String Iniciar(Model inicio) {
        return "regis";
    }

}
