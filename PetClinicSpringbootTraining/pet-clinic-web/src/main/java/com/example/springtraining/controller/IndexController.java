package com.example.springtraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
    @RequestMapping("/find")
    public String oupsHandler(){
        return "notImplemented";
    }
}
