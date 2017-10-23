package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private String parameterName;
    private String parameterValue;

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"Parameter1", "Value1"},
                {"Parameter2", "Value2"},
                {"Parameter3", "Value3"},
                {"Parameter4", "Value4"},
                {"Parameter5", "Value5"},
                {"Parameter6", "Value6"},
                {"Parameter7", "Value7"}
        });
    }

    // Parameter를 받아줄 클래스 생성자. 배열 컬럼수 및 데이터 형과 일치해야 한다
    public ParameterizedTest(String parameterName, String parameterValue) {
        System.out.println("Test case is started");
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    @Test
    public void printParameters() {
        System.out.println("Parameter Name : " + parameterName + ", Parameter Value : " + parameterValue);
        assertTrue(true);

    }
}
