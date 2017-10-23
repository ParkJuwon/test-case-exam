package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AnnotationExpected.class,
		AnnotationFlow.class
})
public class TestSuiteTest {

	@BeforeClass
	public static void doBeforeSuite() {
		System.out.println("Starting test suite");
	}

	@AfterClass
	public static void doAfterSuite() {
		System.out.println("Finishing test suite");
	}
}
