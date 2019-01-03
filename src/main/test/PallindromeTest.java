import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class PallindromeTest {

    @Test
    public void palTest()
    {
        Pallindrome pallindrome=new Pallindrome();

        String expectedValue = "34543 is a palindrome and sum of even number is less than 25.";
        //Act
        String actualValue=pallindrome.palFinal(34543);
        //Assert
        assertEquals(expectedValue,actualValue);


        String expectedValue1 = "6886886 is a palindrome and sum of even number is more than 25.";
        //Act
        String actualValue1=pallindrome.palFinal(6886886);
        //Assert
        assertEquals(expectedValue1,actualValue1);


        String expectedValue2= "1234 is not a pallindrome";
        //Act
        String actualValue2=pallindrome.palFinal(1234);
        //Assert
        assertEquals(expectedValue2,actualValue2);
    }
}