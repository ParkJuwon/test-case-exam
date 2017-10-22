import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.everyItem;
import static org.junit.matchers.JUnitMatchers.hasItems;
import org.junit.Assert;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class AssertExample {

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        Assert.assertEquals("failure - String are not equal", "text", "text");
    }

    @Test
    public void testAssertFalse() {
        Assert.assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame() {
        Assert.assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        Assert.assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);

        Assert.assertSame("should be same", aNumber, aNumber);
    }

    // JUnit Matcher의 assertThat 메서드
    @Test
    public void testAssertThatBothContainsString() {
        Assert.assertThat("albumen",
                both(containsString("a")).and(containsString("b")));
    }

    @Test
    public void testAssertThathasItemsContainsString() {
        Assert.assertThat(Arrays.asList("one", "two", "three" ),
                hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        Assert.assertThat(Arrays.asList(new String[] {"fun", "ban", "net"}),
                everyItem(containsString("n")));
    }

    // JUnit의 assertThat 메서드와 Hamcrest의 Matchers 조합한 형태
    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));
    }

    @Test
    public void testAssertTrue() {
        Assert.assertTrue("failur - should be true", true);
    }
}
