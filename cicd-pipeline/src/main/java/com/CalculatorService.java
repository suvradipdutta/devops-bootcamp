package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum/{num1}/{num2}")
	public int add(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return num1+num2;
	}
	
	@GetMapping("/diff/{num1}/{num2}")
	public int subtract(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return num1-num2;
	}
	
	@GetMapping("/product/{num1}/{num2}")
	public int multiply(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return num1*num2;
	}
	
	@GetMapping("/divisor/{num1}/{num2}")
	public int divide(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return num1/num2;
	}
	
	@GetMapping("/remainder/{num1}/{num2}")
	public int remainder(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return num1%num2;
	}
}
