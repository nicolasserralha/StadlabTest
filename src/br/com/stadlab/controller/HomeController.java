package br.com.stadlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
    @RequestMapping("/home")
    public String execute() {
        System.out.println("Executando a l�gica com Spring MVC");
        return "index";
    }

}
