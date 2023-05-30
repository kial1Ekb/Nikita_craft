package com.example.securingweb.Controllers;

import com.example.securingweb.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.Principal;


@Controller
public class MainPageConfig {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String mainPage(Principal principal, Model model){
        model.addAttribute("principal",userService.getUserByPrincipal(principal));
        return "mainPage";
    }

    @GetMapping("/aboutMe")
    public String aboutMe(Principal principal, Model model){
        model.addAttribute("principal",userService.getUserByPrincipal(principal));
        return "aboutMe";
    }

}
