/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Program is about
 * a. sort the number in non-increasing order
 * b. after sorting sum all the even numbers, the sum should be greater than 15 .
 * c. if sum is more than 15,then print output as true or false.
 */
import java.util.Scanner;

public class Letters {

    String findLetter(char c)
    {
        if( c >=65 && c <= 90 )
        {
            return "Capital Letter";
        }
        else if( c >=97 && c <= 122 )
        {
            return "Small Letter";
        }
        else if( c >= 48 && c <= 57 )
        {
            return "Digit";
        }
        else
        {
            return "Special Symbol";
        }
    }

}