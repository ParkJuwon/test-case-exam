import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by john on 2017. 10. 21..
 */
public class AnnotationTimeout {

    public static long startTime = 0;
    public static long endTime = 0;

    @BeforeClass
    public static void doBefore() {
        startTime = System.currentTimeMillis();
        System.out.println("Starting test...");
    }

    @AfterClass
    public static void doAfter() {
        endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Shutdown test. Elapsed time is " + (elapsedTime / 1000) + " second");
    }

    @Test(timeout = 10000)
    public void calculatedFirst() throws Exception {
        Thread.sleep(20000);
        System.out.println("Calculate First");
        assertTrue(true);
    }


}
