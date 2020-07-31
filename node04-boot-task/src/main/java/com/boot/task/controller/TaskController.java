package com.boot.task.controller;

import com.boot.task.config.AsyncTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TaskController {
    @Resource
    private AsyncTask asyncTask ;
    @RequestMapping("/asyncTask")
    public String asyncTask (){
        asyncTask.asyncTask0();
        asyncTask.asyncTask1();
        return "success" ;
    }
}
