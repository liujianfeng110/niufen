package com.niufen.springboottest1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("hello")
    public String index() {
        return "Hello World";
    }
}
