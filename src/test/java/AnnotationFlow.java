import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnnotationFlow {

    @Before
    public void initialize() {
        System.out.println("Init...");
    }

    @Test
    public void calculatedFirst() {
        System.out.println("Calculate first");
        assertTrue(true);
    }

    @Test
    public void calculateSecond() {
        System.out.println("Calculate second");
        assertTrue(true);
    }

    @After
    public void finalize() {
        System.out.println("Fin...");
    }
}
