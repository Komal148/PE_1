import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class WordTest {
    @Test
    public void wordTest()
    {
        Word word=new Word();
        String expectedValue = "k = Consonent";
        //Act
        String actualValue=word.letters('k');
        //Assert
        assertEquals(expectedValue,actualValue);

    }

}