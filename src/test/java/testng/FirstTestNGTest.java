package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGTest {

	@Test
	public void firstTest() {
		System.out.println("First TestNG code");
		Assert.assertTrue(true);
	}
}
