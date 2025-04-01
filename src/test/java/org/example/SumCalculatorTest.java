package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void BeforEach(){
        calc = new SumCalculator();
    }

    @Test
    public void Input1Output1(){
       int actual = calc.IntSum(1);
       int expected = 1;
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void TestInput3Return6(){
        int actual = calc.IntSum(3);
        int expected = 6;
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void TestOfIlegalArgument(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> calc.IntSum(0));
    }
}