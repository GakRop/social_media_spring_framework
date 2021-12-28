package com.example.socialmedia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SocialMediaController {

    @GetMapping("/socialmedia")
    public String messageForm(Model model) {
        model.addAttribute("socialmedia", new SocialMedia());
        return "form";
    }

    @PostMapping("/socialmedia")
    public String messageSubmit(@ModelAttribute SocialMedia message, Model model) {
        model.addAttribute("socialmedia", message);
        return "result";
    }

    @GetMapping("/history")
    public String mesaageHistory(@ModelAttribute SocialMedia message, Model model){
        return "history";
    }
}