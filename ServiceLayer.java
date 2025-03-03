package com.example.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class AdvancedApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvancedApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String getGreeting() {
        return greetingService.getGreetingMessage();
    }
}

@Service
class GreetingService {
    public String getGreetingMessage() {
        return "Hello from the Service Layer!";
    }
}
