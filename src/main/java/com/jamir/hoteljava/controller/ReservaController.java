package com.jamir.hoteljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {
    @GetMapping("/reservas")
    public String reservas(){
        return "reservas";
    }
}
