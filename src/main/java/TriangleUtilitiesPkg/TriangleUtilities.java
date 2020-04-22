package TriangleUtilitiesPkg;

public class TriangleUtilities {
    public static String getRow(int width) {
        String s = "";
        for(int i = 0; i < width; i++ ){
            s += "*";
        }
        return s;
    }

    public static String getTriangle(int numberOfRows) {
        String s ="";
        for(int i = 1; i < numberOfRows; i++){
            for(int x = 1; x <= i; x++){
                s += "*";
            }
            s += "\n";
        }
        return s;
    }


    public static String getSmallTriangle() {


        String s = "";
        for(int x = 1; x < 5 ; x++ ){
            for(int y = 1 ; y <= x ; y++ ){
                s += "* ";
            }
            s += " \n";
        }

        return s;
    }

    public static String getLargeTriangle() {
        String s = "";
        for(int x = 1;  x < 9; x++){

            for(int y = 1 ; y <= x ; y++ ){
                s += "* ";
            }
            s+= " \n";
        }
        return s;
    }
}
