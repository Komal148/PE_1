/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 *  This program is about
 *   a. Print an error message if the input is not a letter
 *   b. If the input having more than one letter, print the required output
 *    (Vowel or Consonant) for each letter
 */
import java.util.Scanner;

public class Word {
    String letters(char c)
    {

            if( c== 'a' || c =='e' || c =='i' || c =='o' || c == 'u' )
            {
                 return  c + " = Vowel";
            }
            else
            {
                return c + " = Consonent";
            }

    }

}
