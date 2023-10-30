package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }
    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder tbl = new StringBuilder();

        //Outer loop. AKA start a row
        for(int i = 1; i <= tableSize; i++){

            //Inner loop. AKA fill in the row
            for(int j = 1; j <= tableSize; j++) {
                if (i*j < 10) {
                    tbl = tbl.append("  ").append(i*j).append(" |");
                } else if (i*j < 100){
                    tbl = tbl.append(" ").append(i*j).append(" |");
                } else {
                    tbl = tbl.append("").append(i*j).append(" |");
                }
            }
            tbl = tbl.append("\n");
        }
        return tbl.toString();
    }

}
