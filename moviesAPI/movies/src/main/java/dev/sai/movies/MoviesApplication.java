package dev.sai.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotation
@SpringBootApplication
@RestController /*this annotation lets the framework know that this class is an API, and not just another class.*/
public class MoviesApplication {
	//SpringApplication class has a method called run, which is called to run a spring boot application.
	//We send our main class name and args to the function.
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	//GetMapping states that the function below is a GET Endpoint.
//	@GetMapping("/root")
//	public String apiRoot(){
//		return "Hello World!";
//	}
}
