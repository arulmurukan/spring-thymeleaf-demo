package com.arul.thymeleaf.controller;

import com.arul.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    String variableExpression(Model model) {
        model.addAttribute("user", new User("Arul", "tksarul@gmail.com", "ADMIN", "Male"));

        return "variable-expression";
    }

    @GetMapping("link-expression")
    String linkExpression(Model model) {
        model.addAttribute("id", 1);

        return "link-expression";
    }

    @GetMapping("/fragment-expression")
    String fragmentExpression(Model model) {

        return "fragment-expression";
    }

    @GetMapping("users")
    String users(Model model) {
        model.addAttribute("users", List.of(
                new User("Arul", "tksarul@gmail.com", "ADMIN", "Male"),
                new User("Aswin", "aswin@gmail.com", "USER", "Male"),
                new User("Sukin", "avsugin@gmail.com", "ADMIN", "Male"),
                new User("Aravind", "aravind@gmail.com", "GUEST", "Male"),
                new User("Ramu", "aravind@gmail.com", "Unknown", "Male")
        ));

        return "users";
    }
}
