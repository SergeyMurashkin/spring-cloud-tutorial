package ru.murashkin.tutorial.spring.cloud.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String greeting() {
        return "Hello from BASIC microservice";
    }

}
