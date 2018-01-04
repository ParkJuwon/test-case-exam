package testng;

import org.testng.annotations.Test;

public class TestNGExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	public void calculateInvocie() {

		long calculateResult = 10 / 0;
		System.out.println("Calculate invoice data : " + calculateResult);
	}
}
