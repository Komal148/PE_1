import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class ReverseTest {
    @Test
    public void demo()
    {
        Reverse obj=new Reverse();
        String expectedValue = "lamok";
        //Act
        String actualValue=obj.reverseString("komal");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}