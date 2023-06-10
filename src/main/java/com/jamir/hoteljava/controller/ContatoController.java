package com.jamir.hoteljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {
    @RequestMapping("/sobre")
    public String sobre(){
        return "sobre";
    }
    @RequestMapping("/contato")
    public String contato(){
        return "contato";
    }
}
