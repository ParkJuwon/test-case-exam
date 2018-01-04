package testng;

import org.testng.annotations.*;

public class TestNGLifeCycle {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void doTest1() {
		System.out.println("Testing... #1");
	}

	@Test
	public void doTest2() {
		System.out.println("Testing... #2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Before Class");
	}


}
