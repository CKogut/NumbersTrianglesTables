package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static boolean isEven(int num){
        return (num % 2) == 0;
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder even = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (isEven(i)) {
                even.append(i);
            }
        }
        return even.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder odd = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (!isEven(i)) {
                odd.append(i);
            }
        }
        return odd.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squares = "";

        for (int i = start; i < stop; i = i+step) {
                int squared = i*i;
                squares = squares + String.valueOf(squared);
        }
        return squares;
    }

    public static String getRange(int stop) {
        return getRange(0, stop,1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i = i + step) {
            range.append(i);
        }
        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder pow = new StringBuilder();

        for (int i = start; i < stop; i = i+step) {
            pow.append((int) Math.pow(i, exponent));
        }
        return pow.toString();
    }
}
