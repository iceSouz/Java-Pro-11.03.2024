package exceptions;

public class ArrayValueCalculator {
    public static int doCalc(String[][] inputData) {
        checkArraySize(inputData.length, 4);

        int sum = 0;

        for (int i = 0; i < inputData.length; i++) {
            checkArraySize(inputData[i].length, 4);

            for (int j = 0; j < inputData[i].length; j++) {
                try {
                    int digit = Integer.parseInt(inputData[i][j]);
                    sum += digit;
                } catch (Exception e) {
                    throw new ArrayDataException("The element(" + inputData[i][j] + ") of the " +
                            "array[" + i + "][" + j + "] is not a digit.");
                }
            }
        }

        return sum;
    }

    private static void checkArraySize(int arrayLength, int expectedSize) {
        if (arrayLength != expectedSize) {
            throw new ArraySizeException("Array length should be 4, but the input array length is " + arrayLength);
        }
    }
}
