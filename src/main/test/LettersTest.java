import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class LettersTest {
    @Test
    public void demo()
    {

        Letters obj = new Letters();
        String expectedValue = "Capital Letter";
        //Act
        String actualValue=obj.findLetter('A');
        //Assert
        assertEquals(expectedValue,actualValue);
    }

}