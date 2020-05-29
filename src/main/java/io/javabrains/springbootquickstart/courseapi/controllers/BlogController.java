package io.javabrains.springbootquickstart.courseapi.controllers;

import io.javabrains.springbootquickstart.courseapi.models.Post;
import io.javabrains.springbootquickstart.courseapi.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;


    @GetMapping("/blog-main")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("title", "Blog Main");
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        model.addAttribute("title", "Blog Add");
        return "blog-add";
    }


}
