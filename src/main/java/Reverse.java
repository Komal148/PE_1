/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Program to reverse any string without using String Buffer
 */
import java.util.Scanner;

public class Reverse {

    public String reverseString(String str)
    {
        String s;
        s="";
        for( int i=str.length()-1 ; i >= 0 ; i-- )
        {
            s=s+str.charAt(i);
        }
        return s;
    }
}
