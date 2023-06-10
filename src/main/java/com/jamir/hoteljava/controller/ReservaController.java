package com.jamir.hoteljava.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jamir.hoteljava.data.CRUD;
import com.jamir.hoteljava.model.QuartoOcupado;

@Controller
public class ReservaController {
	
	@Autowired
	private CRUD crud;
	
	
    @GetMapping("/reservas")
    public String reservas(Model model){
    	
    	ArrayList<QuartoOcupado> qo = crud.quartosReservados();
    	
    	model.addAttribute("quartosOcupados", qo);
    	
        return "reservas";
    }
}
