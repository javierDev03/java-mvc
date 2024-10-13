package com.javier.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.javier.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("javier", "cervantes");
        model.addAttribute("title", "Hola Mundo desde Spring Boot");
        model.addAttribute("user", user);
      
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        // List<User> users = Arrays.asList(
        //     new User("Pepa", "Gonzalez"),
        //     new User("Lalo", "Perez", "lalo@correo.com"),
        //     new User("Juanita", "Roe", "juanita@correo.com"),
        //     new User("Andres", "Doe"));

    //  model.addAttribute("users", users);
    model.addAttribute("title", "Listado de usuarios!");
     return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel(){
         List<User> users = Arrays.asList(
            new User("Pepa", "Gonzalez"),
            new User("Lalo", "Perez", "lalo@correo.com"),
            new User("Juanita", "Roe", "juanita@correo.com"),
            new User("Andres", "Doe"));

            return users;
    }

}
