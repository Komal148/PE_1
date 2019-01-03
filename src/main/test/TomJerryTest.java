import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TomJerryTest {

        @Test
        public void demo()
        {
            TomJerry obj=new TomJerry();
            String expectedValue = "Tom";
            //Act
            String actualValue=obj.func(23);
            //Assert
            assertEquals(expectedValue,actualValue);

        }


}