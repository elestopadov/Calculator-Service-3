package com.example.calculator;

import java.time.LocalDateTime;

public class CalculationResult {

    private final MathOperation operation;
    private final double[] values;
    private final double result;
    private final LocalDateTime calculationTime;

    public CalculationResult(MathOperation operation, double[] values, double result) {
        this.operation = operation;
        this.values = values.clone();
        this.result = result;
        this.calculationTime = LocalDateTime.now();
    }

    public MathOperation getOperation() {
        return operation;
    }

    public double[] getValues() {
        return values.clone();
    }

    public double getResult() {
        return result;
    }

    public LocalDateTime getCalculationTime() {
        return calculationTime;
    }
}
