import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class RepeatWordTest {
    @Test
    public  void demo(){
        RepeatWord obj=new RepeatWord();
        String expectedValue = "stackrouterouterouterouterouteroute";
        //Act
        String actualValue=obj.repeatWordNtimes("stackroute",5);
        //Assert
        assertEquals(expectedValue,actualValue);

    }


}