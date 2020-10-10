package com.naiyin.loansystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
    @GetMapping("/index")
    public  String get(){
        return "index";
    }
}
