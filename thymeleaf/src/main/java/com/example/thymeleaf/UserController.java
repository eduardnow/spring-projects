package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");

        return "demo";
    }

}
