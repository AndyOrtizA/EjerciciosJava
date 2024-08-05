package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define la clase como un controlador controller
@RequestMapping(path="/api/saludos/")
public class PruebaController {
	//C-POST R-GET U-PUT D-DELETE
	
	
	@GetMapping //Define la ruta para hacer el GET
	public String holaMundo() {
		return "Hola mundo <strong>CH41</stong>!!!";
	}
	
}//class PruebaController 
