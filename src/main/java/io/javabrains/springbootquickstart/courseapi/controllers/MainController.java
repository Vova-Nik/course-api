package io.javabrains.springbootquickstart.courseapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", "CourseApi");
        return "home";
    }

    @GetMapping("/about")
    public String greeting(Model model) {
        model.addAttribute("title", "About CourseApi");
        return "home";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title", "About CourseApi");
        System.out.println("MainController simple mapping +++++++++++++++++");
        return "index";
    }
}