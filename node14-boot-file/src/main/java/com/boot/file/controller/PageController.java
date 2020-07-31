package com.boot.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    /**
     * 上传页面
     */
    @GetMapping("/uploadPage")
    public String uploadPage (){
        return "upload" ;
    }
}
