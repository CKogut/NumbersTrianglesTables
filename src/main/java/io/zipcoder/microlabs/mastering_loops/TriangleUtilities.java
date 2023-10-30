package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();

        int rowCount = 1;
        for (int i = 1; i < numberOfRows; i++){
            String currentRow = getRow(i);
            triangle.append(currentRow).append("\n");
        }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++){
            str.append("*");
        }

        return str.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
