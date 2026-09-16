package com.example.calculator;

import com.example.calculator.exception.DivisionByZeroException;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double percentage(double value, double percent) {
        return value + value * percent / 100;
    }

    public double average(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Values required");
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
