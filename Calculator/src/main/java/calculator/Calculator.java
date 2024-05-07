package calculator;

public class Calculator {
    public static void main(String[] args) {
        try {
            double operand1 = Double.parseDouble(args[0]);
            double operand2 = Double.parseDouble(args[1]);
            char operator = args[2].charAt(0);
            System.out.println(calculate(operand1, operand2, operator));
        } catch (NumberFormatException nfe) {
            System.err.println("Error: " + CalculationError.INVALID_NUMBER.getMessage());
        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '-' -> {
                return operand1 - operand2;
            }
            case 'x' -> {
                return operand1 * operand2;
            }
            case '/' -> {
                if (operand2 == 0) {
                    throw new ArithmeticException(CalculationError.DIVISION_BY_ZERO.getMessage());
                }
                return operand1 / operand2;
            }
            default -> throw new IllegalArgumentException(CalculationError.INCORRECT_OPERATOR.getMessage());
        }
    }
}
