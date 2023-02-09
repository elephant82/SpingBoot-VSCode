package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Printer printer;

    @RequestMapping("/test")
    public String test(){
        printer.print("456");
        return "OK";
    }
    
}
