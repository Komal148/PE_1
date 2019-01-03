import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class UnspecSumTest {
    @Test
    public void unSpecSumTest()
    {
        UnspecSum unspecSum= new UnspecSum();
        int expectedValue = 15;
        //Act
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int actualValue=unspecSum.calculateSum(list,0);
        //System.out.println(actualValue);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

}