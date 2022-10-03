package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"}) //does that mean if we do localhost:8080/ or localhost:8080/home will both work
    public String getHome(){

        return "/home";
    }
}
