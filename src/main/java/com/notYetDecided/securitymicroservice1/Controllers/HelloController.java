package com.notYetDecided.securitymicroservice1.Controllers;


import com.notYetDecided.securitymicroservice1.Models.User;
import com.notYetDecided.securitymicroservice1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String home(){
        System.out.println("Hello");
        return "Hello Ananamous";
    }

    @RequestMapping(value="/user")
    public User userHome(){
        System.out.println("hello User");
        User user= userRepository.findBySyntax("jatin");
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(value ="/admin")
    public String adminHome(){
        return "Hello Admin";
    }
}