package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

@Test(groups = {"command"}) // default test group
public class TestNGGroup {

	@Test(groups = "Windows")
	public void executeRemoteDesktop() {
		System.out.println("execute Remote Desktop");
		Assert.assertTrue(true);
	}

	@Test(groups = "Linux")
	public void executeBashShell() {
		System.out.println("execute Bash Shell");
		Assert.assertTrue(true);
	}

	@Test(groups = {"Windows", "Linux"})
	public void executeJava() {
		System.out.println("execute Java App");
		Assert.assertTrue(true);
	}
}
