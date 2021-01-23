package com.pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

@GetMapping("/")
public String index(){//AQUI ES PARA QUE REGRESE DENTRO DE LA CARPETA TEMPLATES BUSQUE UN ARCHIVO index.html 
return "index";
					 }

@GetMapping("/userForm")
public String userForm() {
	return "user-Form/user-view";
					 }

	
}
