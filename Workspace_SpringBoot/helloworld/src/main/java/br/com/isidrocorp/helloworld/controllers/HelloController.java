package br.com.isidrocorp.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello") //url: http://localhost:8080/hello
	public String sayHello() {
		return "Hello from Springboot! By Isidro";
	}
	
	@GetMapping("/tchau")
	public String sayGoodbye() {
		return "Good Bye Springboot!";
	}
	
	@GetMapping("/mostrenumero/{num}")
	public String mostreNumero(@PathVariable int num) {
		return "Numero que vc passou na URL = " + num;
	}
}
