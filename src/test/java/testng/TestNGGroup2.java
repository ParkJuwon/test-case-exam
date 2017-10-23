package testng;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroup2 {

	@BeforeGroups("Linux")
	public void doBeforeGroup() {
		System.out.println("before group");
	}

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

	@AfterGroups("Linux")
	public void doAfterGroup() {
		System.out.println("after group");
	}
}
