/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * a program using a loop to print the following output.
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
 */
import java.util.Scanner;

public class IterateNum {

    String iterate(int num)
    {
        String str;
        str="";
        for( int i=1; i<=num; i++ )
        {
            for( int j=1; j<=i ;j++ )
            {
                str=str+Integer.toString(i)+" ";
            }
        }
        return str;
    }
}
