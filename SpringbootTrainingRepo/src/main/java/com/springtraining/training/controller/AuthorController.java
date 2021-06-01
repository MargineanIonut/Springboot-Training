package com.springtraining.training.controller;

import com.springtraining.training.repo.AutorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AutorRepository autorRepository;

    public AuthorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", autorRepository.findAll());

        return "authors";
    }
}
