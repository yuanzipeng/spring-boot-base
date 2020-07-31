package com.boot.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("name","知了一笑") ;
        return "index";
    }
}
