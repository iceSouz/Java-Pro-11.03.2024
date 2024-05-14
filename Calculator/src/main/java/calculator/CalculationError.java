package calculator;

public enum CalculationError {
    DIVISION_BY_ZERO("Division by zero is not allowed"),
    INCORRECT_OPERATOR("You entered an incorrect operator"),
    INVALID_NUMBER("One or both operands are not valid numbers.");

    private final String message;

    CalculationError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}