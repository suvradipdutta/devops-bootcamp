package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	int a=30,b=20;

	@GetMapping("/sum")
	public int add() {
		return a+b;
	}
	
	@GetMapping("/diff")
	public int subtract() {
		return a-b;
	}
	
	@GetMapping("/product")
	public int multiply() {
		return a*b;
	}
	
	@GetMapping("/divisor")
	public int divide() {
		return a/b;
	}
	
	@GetMapping("/remainder")
	public int remainder() {
		return a%b;
	}
}
