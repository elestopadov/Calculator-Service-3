package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    @Test
    void serviceCalculatesAddition() {
        CalculatorService service = new CalculatorService();

        CalculationResult result = service.calculate(
                MathOperation.ADD, 2, 3);

        assertEquals(5, result.getResult());
    }

    @Test
    void serviceCalculatesAverage() {
        CalculatorService service = new CalculatorService();

        CalculationResult result = service.calculate(
                MathOperation.AVERAGE, 10, 20, 30);

        assertEquals(20, result.getResult());
    }
}
