import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class IterateNumTest {
    @Test
    public void iterateNumTest() {
        IterateNum iterateNum = new IterateNum();
        String expectedValue = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        //Act
        String actualValue=iterateNum.iterate(5);
        //Assert
        assertEquals(expectedValue,actualValue);

    }
}
