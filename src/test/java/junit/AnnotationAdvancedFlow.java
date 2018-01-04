package junit;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class AnnotationAdvancedFlow {

    //static 메서드여야 한다
    @BeforeClass
    public static void doBefore() {
        System.out.println("Starting test...");
    }

    //static 메서드여야 한다
    @AfterClass
    public static void doAfter() {
        System.out.println("Shutdown test...");
    }

    @Before
    public void initialize() {
        System.out.println("Initialize test...");
    }

    @After
    public void finalize() {
        System.out.println("Finalize test...");
    }

    @Test
    public void calculatedFirst() {
        System.out.println("Calculated First");
        assertTrue(true);
    }

    @Test
    public void calculatedSecond() {
        System.out.println("Calculate Second");
        assertTrue(true);
    }
}
