package com.sb.statebenefits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "form"; // This will render form.html
    }
}
