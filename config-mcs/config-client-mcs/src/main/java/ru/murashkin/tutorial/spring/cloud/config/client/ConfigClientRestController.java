package ru.murashkin.tutorial.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRestController {

    @Value("${app.service.name}")
    String appName;

    @GetMapping("/")
    public String greeting() {
        return "Hello from" + appName;
    }

}
