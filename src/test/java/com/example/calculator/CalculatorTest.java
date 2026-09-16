package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.calculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void additionWorks() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractionWorks() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void multiplicationWorks() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    void divisionWorks() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divisionByZeroFails() {
        assertThrows(DivisionByZeroException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void powerWorks() {
        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    void percentageWorks() {
        assertEquals(220, calculator.percentage(200, 10));
    }

    @Test
    void averageWorks() {
        assertEquals(20, calculator.average(10, 20, 30));
    }
}
