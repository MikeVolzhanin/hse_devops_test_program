package ru.volzhanin;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorialPositive() {
        assertEquals(1, Factorial.factorialIterative(0));
        assertEquals(1, Factorial.factorialIterative(1));
        assertEquals(2, Factorial.factorialIterative(2));
        assertEquals(6, Factorial.factorialIterative(3));
        assertEquals(24, Factorial.factorialIterative(4));
        assertEquals(120, Factorial.factorialIterative(5));
        assertEquals(720, Factorial.factorialIterative(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorialIterative(-1);
    }
}
