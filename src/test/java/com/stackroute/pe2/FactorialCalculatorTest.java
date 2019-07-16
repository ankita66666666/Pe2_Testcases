
package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {

    private FactorialCalculator factorialCalculator;

    @Before
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @After
    public void tearDown() {
        factorialCalculator = null;
        //checking factorial=null;
    }

    @Test
    public void testIntFactorialSuccessGivenNumberShouldReturnFactorial() {
        assertEquals("checkIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(1));

        assertEquals("checkIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(4));

        assertEquals("checkIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(12));
        //Test actual result = expected result();
    }

    @Test
    public void checkIntFactorialFailureGivenNumberShouldReturnNegativeOne() {
        assertEquals("checkIntFactorialGivenNumberShouldReturnFactorial: check intFactorial(), Should have returned -1",
                -1, factorialCalculator.intFactorial(13));
    }


    @Test
    public void checkLongFactorialSuccessGivenNumberShouldReturnFactorial() {
        assertEquals("checkLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(1));

        assertEquals("checkLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(4));

        assertEquals("checkLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(12));

        assertEquals("checkLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(20));
    }
}