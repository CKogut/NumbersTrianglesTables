package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int numberOfStars) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++){
            str = str.append("*");
        }

        return str.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < i; j++) {
                str = str.append("*");
            }
            str = str.append("\n");
        }
        return str.toString();
    }

    public static String getLargeTriangle() {
        return null;
    }
}
