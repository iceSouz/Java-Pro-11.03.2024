package exceptions;

public class ArrayValueCalculator {
    private static final String ARRAY_SIZE_EXCEPTION = "Array length should be 4, but the input array length is ";
    public static int doCalc(String[][] inputData) {
        if (inputData.length != 4) {
            throw new ArraySizeException(ARRAY_SIZE_EXCEPTION + inputData.length);
        }

        int sum = 0;

        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i].length != 4) {
                throw new ArraySizeException(ARRAY_SIZE_EXCEPTION + inputData[i].length);
            }

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
}
