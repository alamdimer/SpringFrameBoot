package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pruebas.entity.User;
import com.pruebas.repository.RoleRepository;
import com.pruebas.service.UserService;


@Controller
public class UserController {

@Autowired	
UserService userService;	
	
@Autowired
RoleRepository roleRepository;

@GetMapping("/")
public String index(){//AQUI ES PARA QUE REGRESE DENTRO DE LA CARPETA TEMPLATES BUSQUE UN ARCHIVO index.html 
return "index";
					 }

@GetMapping("/userForm")
public String userForm(Model model) {
	model.addAttribute("userForm",new User());
	model.addAttribute("userList", userService.getAllUsers());
	model.addAttribute("roles",roleRepository.findAll());
	model.addAttribute("listTab","active");
	return "user-form/user-view";
					 }
}
