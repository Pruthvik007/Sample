package org.sai.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/welcome")
    String hello(){
        return "Hello World";
    }

    @GetMapping("/name")
    String name(){
        return "Sai Pruthvik";
    }
}
