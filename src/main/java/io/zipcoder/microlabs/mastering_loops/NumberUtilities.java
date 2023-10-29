package io.zipcoder.microlabs.mastering_loops;

// Test for this method is testing for odd numbers?
public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String even = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                even = even + String.valueOf(i);
            }
        }
        return even;
    }

    // Test for this method is testing for even numbers?
    public static String getOddNumbers(int start, int stop) {
        String odd = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                odd = odd + String.valueOf(i);
            }
        }
        return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squares = "";

        for (int i = start; i < stop; i = i+step) {
                int squared = i*i;
                squares = squares + String.valueOf(squared);
        }
        return squares;
    }

    public static String getRange(int start) {
        String range = "";

        for (int i = 0; i < start; i++) {
            range = range + String.valueOf(i);
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";

        for (int i = start; i < stop; i++) {
            range = range + String.valueOf(i);
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";

        for (int i = start; i < stop; i = i + step) {
            range = range + String.valueOf(i);
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentiate = "";

        for (int i = start; i < stop; i = i+step) {
            int result = (int) Math.pow(i, exponent);
            exponentiate = exponentiate + String.valueOf(result);
        }
        return exponentiate;
    }
}
