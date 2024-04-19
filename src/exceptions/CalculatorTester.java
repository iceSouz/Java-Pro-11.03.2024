package exceptions;

public class CalculatorTester {
    public static void main(String[] args) {
        String[][] ints = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "c", "4"}
        };

        try {
            int calcSum = ArrayValueCalculator.doCalc(ints);
            System.out.println("calcSum = " + calcSum);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
