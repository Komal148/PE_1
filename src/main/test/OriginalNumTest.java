import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class OriginalNumTest {
    OriginalNum obj;
    @Before
    public void setUp()
    {
        obj=new OriginalNum();
    }

    @Test
    public void OriginalNumSuccessTest()
    {
        String actualstr=obj.guessOriginalNum(23,23);
        String expectedstr="Number guessed matches the original number";
        assertEquals(expectedstr,actualstr);
    }

    @Test
    public void OriginalNumFailureTest()
    {
        String actualstr=obj.guessOriginalNum(43,23);
        String expectedstr="Number guessed is more than the original number";
        assertEquals(expectedstr,actualstr);
    }

    @After
    public void tearDown()
    {
        obj=null;
    }

}