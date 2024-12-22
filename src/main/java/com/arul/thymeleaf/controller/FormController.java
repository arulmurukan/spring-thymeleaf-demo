package com.arul.thymeleaf.controller;

import com.arul.thymeleaf.model.UserRegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FormController {

    private final List<String> profession = List.of("Developer", "Tester", "Architect");

    @GetMapping("register")
    String register(Model model) {

        UserRegistrationForm form = new UserRegistrationForm();
        model.addAttribute("userForm", form);
        model.addAttribute("professions", profession);

        return "register-form";
    }

    @PostMapping("register/save")
    String save(Model model, @ModelAttribute("userForm") UserRegistrationForm form) {

        model.addAttribute("userForm", form);
        return "registered-user";
    }
}
