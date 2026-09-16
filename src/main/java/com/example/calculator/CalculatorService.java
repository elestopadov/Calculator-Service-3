package com.example.calculator;

public class CalculatorService {

    private final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();

        if (args.length != 3) {
            System.out.println("Usage: java -jar calculator-service-1.0.jar <number1> <operator> <number2>");
            System.out.println("Example: java -jar calculator-service-1.0.jar 10 + 5");
            return;
        }

        double first = Double.parseDouble(args[0]);
        String operator = args[1];
        double second = Double.parseDouble(args[2]);

        MathOperation operation = switch (operator) {
            case "+" -> MathOperation.ADD;
            case "-" -> MathOperation.SUBTRACT;
            case "*" -> MathOperation.MULTIPLY;
            case "/" -> MathOperation.DIVIDE;
            case "%" -> MathOperation.PERCENTAGE;
            case "^" -> MathOperation.POWER;
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };

        CalculationResult result = service.calculate(operation, first, second);
        System.out.println("Result: " + result.getResult());
    }

    public CalculationResult calculate(MathOperation operation, double... values) {
        double result;

        switch (operation) {
            case ADD:
                result = calculator.add(values[0], values[1]);
                break;
            case SUBTRACT:
                result = calculator.subtract(values[0], values[1]);
                break;
            case MULTIPLY:
                result = calculator.multiply(values[0], values[1]);
                break;
            case DIVIDE:
                result = calculator.divide(values[0], values[1]);
                break;
            case POWER:
                result = calculator.power(values[0], values[1]);
                break;
            case PERCENTAGE:
                result = calculator.percentage(values[0], values[1]);
                break;
            case AVERAGE:
                result = calculator.average(values);
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation");
        }

        return new CalculationResult(operation, values, result);
    }
}
