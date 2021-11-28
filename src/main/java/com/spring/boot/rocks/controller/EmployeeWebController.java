package com.spring.boot.rocks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeWebController {

    @GetMapping({ "/", "/index" })
    public String main() {
        return "index";
    }
}