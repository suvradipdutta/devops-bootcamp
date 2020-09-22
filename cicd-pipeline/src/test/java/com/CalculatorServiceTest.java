package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {

	@Test
	public void test() {
		CalculatorService cs = new CalculatorService();

		Assertions.assertEquals(cs.add(), 50);
		Assertions.assertEquals(cs.subtract(), 10);
		Assertions.assertEquals(cs.multiply(), 600);
		Assertions.assertEquals(cs.divide(), 1);
		Assertions.assertEquals(cs.remainder(), 10);
	}
}
