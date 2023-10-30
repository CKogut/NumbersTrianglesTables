package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder tbl = new StringBuilder();

        //Outer loop. AKA start a row
        for(int i = 1; i <= 5; i++){

            //Inner loop. AKA fill in the row
            for(int j = 1; j <=5; j++) {
                if (i*j < 10) {
                    tbl = tbl.append("  ").append(i*j).append(" |");
                } else {
                    tbl = tbl.append(" ").append(i*j).append(" |");
                }
            }
                tbl = tbl.append("\n");
        }
        return tbl.toString();
    }
    public static String getLargeMultiplicationTable() {
        StringBuilder tbl = new StringBuilder();

        //Outer loop. AKA start a row
        for(int i = 1; i <= 10; i++){

            //Inner loop. AKA fill in the row
            for(int j = 1; j <=10; j++) {
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

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder tbl = new StringBuilder();

        //Outer loop. AKA start a row
        for(int i = 1; i <= 20; i++){

            //Inner loop. AKA fill in the row
            for(int j = 1; j <=20; j++) {
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
