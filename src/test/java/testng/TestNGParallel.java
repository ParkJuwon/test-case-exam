package testng;

import org.testng.annotations.Test;

public class TestNGParallel {

	@Test(threadPoolSize = 10, invocationCount = 10, timeOut = 2000)
	public void parallelTestMethod() {
		System.out.println("Parallel Test");
	}

}
