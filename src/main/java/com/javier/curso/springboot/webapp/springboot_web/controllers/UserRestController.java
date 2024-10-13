package com.javier.curso.springboot.webapp.springboot_web.controllers;



// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javier.curso.springboot.webapp.springboot_web.models.User;
import com.javier.curso.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDto details(){
        User user = new User("javier", "cervantes");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo desde Spring Boot");
        // Map<String, Object> body = new HashMap<>();
        // body.put("title", "Hola Mundo desde Spring Boot");
        // body.put("user", user );
  
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("javier", "cervantes");
        User user2 = new User("pepe", "gomez");
        User user3 = new User("jone", "lopez");

        List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

}
