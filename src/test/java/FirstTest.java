import junit.framework.TestCase;

public class FirstTest extends TestCase {

    public void testCalculatedDivide() {
        double resultOfDivide = 10 / 5 ;
        assertEquals("10 나누기 5는 2?" , 2 , resultOfDivide, 0);
    }
}
