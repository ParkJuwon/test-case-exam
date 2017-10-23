package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsuracneInvoice {

	SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// 테스트 메서드 실행 전에 실행
	@BeforeMethod
	public void init() {
		System.out.println("Starting Invoice Test : " + sformat.format(new Date()));
	}

	@Test
	public void calculateInvoice() {
		double invoiceAmount = 1000000.0;

		invoiceAmount = invoiceAmount * 2;

		Assert.assertEquals(invoiceAmount, 2000000.0, 0.0, "Total amount");
	}

	// 테스트 메서드 실행 전에 실행된다.
	@AfterMethod
	public void finalize() {
		System.out.println("Finishing Invoice Test : " + sformat.format(new Date()));
	}
}
