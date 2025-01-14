package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;

@Controller
public class GreetingController {
    // Use String array instead of char array
    String[] grades = {"VeryGood", "Good", "Ok", "Weak"};
    Random random = new Random();

    @GetMapping("/grade")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Anon") String name, Model model) {
        // Generate a random grade
        String randomGrade = grades[random.nextInt(grades.length)];
        // Add attributes to the model
        model.addAttribute("name", name);
        model.addAttribute("grade", randomGrade);
        /// add functionality to the input element
        /// edit after test
        return "greeting";
    }
}
