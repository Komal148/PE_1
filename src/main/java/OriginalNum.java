/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Program which accepts a number from user as input
 * (set the limit say 1 - 50 or 1 - 100) User should guess
 * until the the target number is guessed correctly.
 * Print separate messages for the following:
 *     a. Number guessed is more than original number
 *     b. Number guessed is less than original number
 *     c. Number guessed matches the original number
 */
import java.util.ArrayList;
import java.util.Scanner;

public class OriginalNum {

    public String guessOriginalNum(int num, int target)
    {
            if( num >= 1 && num <= 100 )
            {
                if( num == target )
                {
                    return "Number guessed matches the original number";
                }
                else if( num > target )
                {
                    return "Number guessed is more than the original number";
                }
                else
                {
                    return "Number guessed is less than the original number";
                }
            }

        return "No. is out of Range.";
    }

    public String originalNumber(int target)
    {
        int num;
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt())
        {
            num=input.nextInt();

            return guessOriginalNum(num,target);
        }


        return "Kindly put Integer.";
    }


    public static void main(String[] args) {
        int num;
        int sum = 0;
        int target=23;
        OriginalNum obj=new OriginalNum();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");
        System.out.println(obj.originalNumber(target));
        /*while (input.hasNextInt()) {
            num = input.nextInt();
            if( num >=1 && num <= 100 )
            {
                System.out.println("Number guessed matches the original number" );
                break;
            }
            else if( num <=1 )
            {
                System.out.println("Number guessed is less than the original number" );
            }
            else
            {
                System.out.println("Number guessed is more than the original number" );
            }
        }
*/
    }
}
