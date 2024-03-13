package com.exes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DemoController {
    @GetMapping("/address")
    public String getAddress()
    {
        return "India";
    }
    @GetMapping("/name")
    public String getName()
    {
        return "Play java";
    }
    @GetMapping("/status")
    public String getStatus()
    {
        return "active";
    }
}
