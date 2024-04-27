package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.News;
import com.example.demo.repository.NewsRepository;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsRepository nr;

    @GetMapping("/list")
    public String listNews(Model model) {
        model.addAttribute("newsList", nr.findAll());
        return "list";
    }

    @GetMapping("/addnews")
    public String showAddNewsForm(Model model) {
    	News n=new News();
        model.addAttribute("news",n);
        return "addnews";
    }

    @PostMapping("/addnews")
    public String addNews(News n) {
        nr.save(n);
        return "redirect:/list";
    }
}
