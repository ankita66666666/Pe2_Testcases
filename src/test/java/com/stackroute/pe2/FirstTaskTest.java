package com.stcakroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTaskTest {
    FirstTask firstTask=new FirstTask();

    @Test

    public void isCheckDemo()
    {
        String string= firstTask.palindromeMain(121);
        assertEquals("Palindrome Lesser than 25",string);
    }


   /* @Test
    public void isPalindrome() {
    }

    @Test
    public void isSumOfEvenGreater() {
    }

    */
}