package org.ohgiraffers.practice2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Practice2ApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	@DisplayName("더하기 기능 테스트")
	void checkTwoNumberEqualTests(){
		int firstNum = 10;
		int secondNum = 20;
		int expected = 30;

		calculator calculator = new calculator();
		int result = calculator.plusTwoNumbers(firstNum,secondNum);

		Assertions.assertEquals(expected, result);
	}
}
