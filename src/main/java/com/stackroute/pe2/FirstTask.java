package com.stcakroute.pe1;

import java.util.*;

public class FirstTask {
    /* public static void main(String args[])
     {
         int num,rev=0,temp,even,total=0;
                 Scanner input=new Scanner(System.in);
         System.out.println("Enter number to check palindrome or not!");
         num=input.nextInt();
         temp=num;


             while(num%10!=0)
             {
                 rev=rev*10+num%10;
                 num=num/10;
             }


         if(temp==rev)
         {
             System.out.println("Palindrom");
         }
         else
         {
             System.out.println("Not a palindrome");
         }
         while(temp%10!=0)
         {
             even=temp%10;
             if(even%2==0)
             {
                 total=total+even;
             }
             temp=temp/10;
         }
           if(total>25)
           {
               System.out.println("Sum of even is greater than 25");
           }
           else
           {
               System.out.println("not greater than 25");
           }
     }*/
    public String palindromeMain(int number) {
        String result = "Not a Palindrome";
        if (isPalindrome(number))
        {
            if (isSumOfEvenGreater(number) > 25)
            {
                return "Palindrome Greater than 25";
            } else {
                return "Palindrome Lesser than 25";
            }
        }

        return result;
    }


    public boolean isPalindrome(int number) {
        boolean b1 = false;
        int temp = number;
        int rev = 0;
        //System.out.println(number);


        while (number % 10 != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
           // System.out.println(number);
        }


        if (temp == rev)
            b1 = true;
       // System.out.println(b1);
        return b1;

    }


    public int isSumOfEvenGreater(int number) {
        int temp = number;
        int even;
        int total = 0;
        while (temp % 10 != 0) {
            even = temp % 10;
            if (even % 2 == 0) {
                total = total + even;

            }
            temp = temp / 10;
        }

        return total;
    }
}








