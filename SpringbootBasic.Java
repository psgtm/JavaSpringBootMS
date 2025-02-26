import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootBasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }
}