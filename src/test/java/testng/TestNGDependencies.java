package testng;

import org.testng.annotations.Test;

public class TestNGDependencies {

	@Test(groups = "initial")
	public void loadFromDB() {
		System.out.println("loadFromDB");
	}

	@Test(groups = "initial", dependsOnMethods = "loadFromDB")
	public void checkLoadingDataValidation() {
		System.out.println("checkLoadingDataValidation");
	}

	@Test(dependsOnGroups = {"initial"})
	public void executeTransaction1() {
		System.out.println("executeTransaction1");
	}

	@Test(dependsOnGroups = {"initial"})
	public void executeTransaction2() {
		System.out.println("executeTransaction2");
	}
}
