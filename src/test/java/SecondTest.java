import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondTest {

    @Test
    public void testCalculatedDivide() {
        double resultOfDivide = 10 / 5;
        assertEquals("10 나누기 5는 2 ?", 2 , resultOfDivide, 0);
    }
}
