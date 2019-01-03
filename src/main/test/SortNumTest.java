import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SortNumTest {

    SortNum obj;
    @Before
    public void setUp() {
        obj = new SortNum();
    }

    @After
    public void tearDown()
    {
        obj=null;
    }

    @Test
    public void sortNumTestSuccess()
    {
        int actualValue1=obj.sortDigits(345648);
        int expectedValue1=865443;
        assertEquals(expectedValue1,actualValue1);

        boolean actualValue2=obj.calculateSum(0,345648);
        boolean expectedValue2=true;
        assertEquals(actualValue2,expectedValue2);
    }

    @Test
    public void sortNumTestFailure()
    {
        boolean actualValue=obj.calculateSum(0,34564);
        boolean expectedValue=false;
        assertEquals(expectedValue,actualValue);
    }



}