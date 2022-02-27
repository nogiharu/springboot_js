package com.example.springboot_js.controller;

import java.util.Arrays;
import java.util.List;

import com.example.springboot_js.form.JsUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JsController {
    
    @GetMapping("/")
    public String showJs(Model model) {
        List<JsUser> list = Arrays.asList(new JsUser("安藤", 12, 1,0),new JsUser("田中", 23, 2,1));
        model.addAttribute("jsList", list);
        model.addAttribute("jsUser",new JsUser("TOM", 12, 1,0));
        model.addAttribute("url", "/js");
        return "list";
    }

    @GetMapping("/js")
    public String reShowJs(JsUser jsUser,Model model) {
        List<JsUser> list = Arrays.asList(new JsUser("安田", 12, 1,0),new JsUser("中村", 23, 2,1));
        model.addAttribute("jsUser",new JsUser("TOM", 12, 1,1));
        model.addAttribute("jsList", list);
        return "list";
    }
}