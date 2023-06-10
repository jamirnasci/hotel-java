package com.jamir.hoteljava.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jamir.hoteljava.data.CRUD;
import com.jamir.hoteljava.model.Quarto;

@Controller
public class QuartosController {
	
	@Autowired
	private CRUD crud;
    
    @GetMapping("/quartos")
    public String quartos(Model model){
    	
		ArrayList<Quarto> quartos = crud.quartosDisponiveis();
		model.addAttribute("quartos", quartos);

        return "quartos";
    }
}
