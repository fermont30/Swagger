package com.montoya.fernando.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("path")
    public String getMethodName() {
        return new String("Hello World");
    }
    
    
}
