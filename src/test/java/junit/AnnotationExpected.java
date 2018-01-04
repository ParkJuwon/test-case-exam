package junit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnnotationExpected {
    @Test(expected = java.lang.ArithmeticException.class)
    public void calculatedFirst() {
        int amountOfApple = 100;
        int peoples = 0;
        int applePerPeople = amountOfApple / peoples;
        System.out.println(applePerPeople);
        assertTrue(true);
    }
}
