/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jamir.hoteljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jamir
 */

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
