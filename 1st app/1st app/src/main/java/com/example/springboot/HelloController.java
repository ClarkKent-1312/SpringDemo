package com.example.springboot;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from consultadd!";
	}

}
