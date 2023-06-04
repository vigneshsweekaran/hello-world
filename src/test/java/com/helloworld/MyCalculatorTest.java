package com.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorTest {

    @Test
    public void testAddition() {
        MyCalculator test = new MyCalculator();
        Assert.assertEquals("The output should be 7", 7, test.addition(5,2));
    }

    @Test
    public void testSubtraction() {
        MyCalculator test = new MyCalculator();
        Assert.assertEquals("The output should be 3", 3, test.subtraction(5,2));
    }

    @Test
    public void testMultiplication() {
        MyCalculator test = new MyCalculator();
        Assert.assertEquals("The output should be 6", 6, test.multiplication(2,3));
    }

    @Test
    public void testDivision() {
        MyCalculator test = new MyCalculator();
        Assert.assertEquals("The output should be 2", 2, test.division(8,4));
    }
}
