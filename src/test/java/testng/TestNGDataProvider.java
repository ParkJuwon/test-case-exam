package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@DataProvider(name="car-brands")
	public Object[][] fetchCityData() {
		return new Object[][] {
				new Object[] {"Hyundai"},
				new Object[] {"KIA"},
				new Object[] {"GM"},
				new Object[] {"Toyota"},
				new Object[] {"Porsche"}
		};
	}

	@Test(dataProvider = "car-brands")
	public void findHotelsInCity(String brand) {
		System.out.println("My best car : " + brand);
	}
}
