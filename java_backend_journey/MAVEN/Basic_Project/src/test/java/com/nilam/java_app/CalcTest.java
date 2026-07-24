package com.nilam.java_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
        @Test
        void testCalc()
       {
            Calculation calc = new Calculation();
            int actualResult = calc.divide(10,5);
            int expectedResult = 2;
            assertEquals(expectedResult, actualResult);
       }



}
