package com.guthub.throyer.Hello.controllers;

import com.guthub.throyer.Hello.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @Autowired
    private UsuarioRepository repository;

    @RequestMapping("/")
    public String index(Model model, Pageable pageable) {
        var pagina = repository.findAll(pageable);
        model.addAttribute("pagina", pagina);
        return "index";
    }
    
}